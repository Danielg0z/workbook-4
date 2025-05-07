package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookSuites;
    private int bookBasicRooms;


    //Hotel(String name, int numberOfSuites, int numberOfRooms)
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }
//Hotel(String name, int numberOfSuites , int numberOfRooms, int bookedSuites, int bookedBasicRooms)
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookSuites, int bookRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookSuites = 0; // how many suites are not available
        this.bookBasicRooms = 0; //how many rooms are not available
    }

    public int getBookBasicRooms() {
        return this.bookBasicRooms;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfSuites() {
        return this.numberOfSuites;
    }

    public int getBookSuites() {
        return this.bookSuites;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }



    /*
    Figure out if there are enough rooms by subtracting the booked rooms or suites from the number of rooms or suites in the entire hotel
    If there aren’t enough rooms return false
    If there are enough rooms adjust the book rooms number or book suites number and return true
    **/

    // Derived Methods

    // subtract the total number of Suites from the book rooms and return that
    public int getAvailableSuites(){
        return this.numberOfSuites - this.bookSuites;
    }

    // subtract the total number of basic rooms from the book rooms and return that
    public int getAvailableRoom(){
        return this.numberOfRooms - this.bookBasicRooms;
    }


    public boolean bookRoom(int numberOfRooms, boolean isSuite){
    // specify how many rooms you would like to book
        // if the available rooms are less than or equal to the total rooms and not a suite
        if(numberOfRooms <= getAvailableRoom() && !isSuite){
            //then the available basic rooms selected update to booked rooms
            this.bookBasicRooms += numberOfRooms; // updates books Rooms
            return true;
        }
        else if (numberOfSuites <= getAvailableSuites() && isSuite){
            this.bookSuites += numberOfRooms; // updates books suites
            return true;
        } else{
            return false;
        }
    }


    // to get the available rooms, you have to subtract the unavailable
    // rooms from the total number of rooms

}
