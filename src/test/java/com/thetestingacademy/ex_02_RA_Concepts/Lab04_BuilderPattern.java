package com.thetestingacademy.ex_02_RA_Concepts;

public class Lab04_BuilderPattern {

    public Lab04_BuilderPattern Step1()
    {
        System.out.println("Step 1");
        return this;// When Step 1 is done it will return the reference of Lab04_BuilderPattern
    }
    public Lab04_BuilderPattern Step2()
    {
        System.out.println("Step 2");
        return this; // When Step 2 is done it will return the reference of Lab04_BuilderPattern
    }
    public Lab04_BuilderPattern Step3(String name)
    {
        System.out.println("Step 3");
        return this; // When Step 3 is done it will return the reference of Lab04_BuilderPattern
    }

    public static void main(String[] args) {
        Lab04_BuilderPattern Bp=new Lab04_BuilderPattern();
        Bp.Step1().Step2().Step3("Raja");
        // Advantage is after Step1 we can use dot Operator by using same reference Bp can finish Step1
        // Step2 and Step3 at a time.
        // Every function like given,when, then will return the same thing that's why we are
        // using dot operator here

    }
}
