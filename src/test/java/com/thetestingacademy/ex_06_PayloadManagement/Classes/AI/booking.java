package com.thetestingacademy.ex_06_PayloadManagement.Classes.AI;

public class booking {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;

    // Getters and Setters
    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public int gettotalprice() {
        return totalprice;
    }

    public void settotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isdepositpaid() {
        return depositpaid;
    }

    public void setdepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public BookingDates getbookingdates() {
        return bookingdates;
    }

    public void setbookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getadditionalneeds() {
        return additionalneeds;
    }

    public void setadditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }
}

