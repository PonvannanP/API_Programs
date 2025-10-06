package com.thetestingacademy.ex_06_PayloadManagement.Manual.ResponsePayload;

import com.thetestingacademy.ex_06_PayloadManagement.Manual.RequestPayload.Booking;

public class BookingResponse {
    // Response can also be converted to POJO class and we have two things only
    // one is booking id and booking in response

    private Integer bookingId;// Instance variables

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    private Booking booking;// By using classes
}
