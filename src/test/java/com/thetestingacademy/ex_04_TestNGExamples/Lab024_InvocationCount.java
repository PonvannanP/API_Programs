package com.thetestingacademy.ex_04_TestNGExamples;

import org.testng.annotations.Test;

public class Lab024_InvocationCount {
    @Test(invocationCount = 2)
    public void NG()
    {
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void NG1()
    {
        System.out.println("Bye");
    }
}
