package com.pluralsight;

public class Room {
    // a room is only aviable if it is clean and occupied
    // if get room type (if the room is a king or a double, then this calcualation will equal to the
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    //Derived Method
    public boolean isAvailable(){
        return !this.isOccupied() && !this.isDirty();
    }

    public double getPrice() {
        return price;
    }

    //Methods for execrise 2
    //1st: what is the question asking for? :

    /*
     add a checkIn method
     once room has been checkIn,
     it should be occupied and dirty
    */
    public boolean checkIn(boolean isOccupied, boolean isDirty) {

        if (isAvailable()) {
            this.isDirty = true;
            // isDirty stays true until cleaned
        return true;
        } else {
            System.out.println("Room isn't avaiable for check in, Room must be cleaned first.");
        return false;
        }

    }
    /*
   add a checkOut method
   once a room is checked out it must first be cleaned by a housekeeper
   to handle the cleaning we must first make a cleaned room method
    */
    // if room is not cleaned, another guest cant check it in
    public void checkOut() {
        // passed the cleaned room for readability
        // change clean back to still dirty
        cleanRoom();
        isDirty = true;
    }

    public void cleanRoom(){
        if(isDirty) {
            isDirty = false;

        } else{
            System.out.println("Room is already clean");
        }
    }


}
