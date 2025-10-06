package com.thetestingacademy.ex_04_TestNGExamples;

import org.testng.annotations.Test;

public class Lab023_AlwaysRun {
    @Test
    public void new_Register()
    {
        System.out.println("Registration");
    }

    @Test(alwaysRun = true,enabled = false)
    public void login()
    {
        System.out.println("Login");
    }

    @Test
    public void normal()
    {
        System.out.println("Normal");
    }
}
