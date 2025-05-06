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
}
