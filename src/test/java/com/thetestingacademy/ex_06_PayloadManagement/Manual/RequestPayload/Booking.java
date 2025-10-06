package com.thetestingacademy.ex_06_PayloadManagement.Manual.RequestPayload;

public class Booking {

    // Getter and Setter
    private String firstname;// Instance variables

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public Bookingdates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(Bookingdates bookingdates) {
        this.bookingdates = bookingdates;
    }
    // And this is POJO class POJO class is nothing but a class which is mapped to JSON Payload

    private String lastname; //Instance variables
    private Integer totalprice; //Instance variables
    private Boolean depositpaid; //Instance variables
    private String additionalneeds; //Instance variables

    private Bookingdates bookingdates;// This is a Class



}
