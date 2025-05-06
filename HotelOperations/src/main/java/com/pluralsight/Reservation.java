package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private double price;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public double getPrice() {
        if(roomType.equalsIgnoreCase("king")){
        price = 139.00;
        return price;
        }

        return 124.00;
    }

    public double getReservationTotal() {
       //if its a weekend then there is a 10% increase on your stay per day
        if(isWeekend){
        return 1.1 * (this.price * this.numberOfNights);
       }
        return this.price * this.numberOfNights;

    }

    public String getRoomType() {
        return this.roomType;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }




}
