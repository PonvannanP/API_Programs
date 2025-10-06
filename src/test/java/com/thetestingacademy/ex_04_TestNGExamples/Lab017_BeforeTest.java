package com.thetestingacademy.ex_04_TestNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab017_BeforeTest {
    @BeforeTest
    public void getToken()
    {
        System.out.println("Before Token");
    }

    @BeforeTest
    public void getBookingid()
    {
        System.out.println("Before bookingid");
    }
// Before running Actual Test which is PUT Request Token and bookingid should be there
    @Test
    public void PUT_Request()
    {
        System.out.println("PUT Request test");
    }
// After Running all things should be closed
    @AfterTest
    public void Close_Allthings()
    {
        System.out.println("Close All things");
    }

    // In Output usually the Test cases will run based on Alphabetical order
    //Example: getBookingId(),getToken()
}
