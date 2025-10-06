package com.thetestingacademy.ex_04_TestNGExamples;

import org.testng.annotations.Test;

public class Lab019_Groups {

    @Test(groups = {"Regression","Sanity"},priority =1)
    public void Sanity()
    {
        System.out.println("Sanity Test Cases");
    }


    @Test(groups ={"Regression","P1"},priority =2 )
    public void P1()
    {
        System.out.println("P1 Test Cases");
    }


    @Test(groups ={"Regression","Smoke"},priority =3 )
    public void Smoke()
    {
        System.out.println("Smoke Test Cases");
    }

}
