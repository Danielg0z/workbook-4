package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private double startTime;// start time



    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // basic getters


    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    //Basic setters

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    public int getRegularHours() {
        // must not be higher than 40 hours
        return Math.min(40, hoursWorked); // 40 is the most hours, hours worked never exceeds 40
    }

    public int getOvertimeHours() {
      // Overtime is any hours over 40
        return Math.max(0,hoursWorked - 40); // calculated every hour over 40 regular hours
    }

    public double getTotalPay() {
        //Total pay = regular + overtime pay
        int regularHours = getRegularHours();
        int overtimeHours = getOvertimeHours();

        double regularPay = regularHours * payRate;
        double overtimePay = overtimeHours * payRate * 1.5; //Pay overtime hours (hours > 40) at 1.5× pay rate.

        return regularPay + overtimePay; // returns calculated total
    }

    //Methods for execrise 2

    //1st: what is the question asking for? :

    //puch in is taking the time they gave you and setting it as the start time
    public void punchIn(double time){
        this.startTime = time; // just to store the time
    }
    /*
    punchOut - time difference between the time checking
    and the time check out to get the hours worked
    then add this to the hours worked, then you've basically punched out
    */
    public void punchOut(double time){
         double leavetime = time - this.startTime; // time worked
         hoursWorked += leavetime; // adds how long they worked to total hours
    }


}
