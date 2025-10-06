package com.thetestingacademy.ex_06_PayloadManagement.Manual.RequestPayload;

public class Bookingdates {

    private String checkIn;// Instance variables

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    private String checkOut;// Instance variables

    // And this is POJO class POJO class is nothing but a class which is mapped to JSON Payload
}
