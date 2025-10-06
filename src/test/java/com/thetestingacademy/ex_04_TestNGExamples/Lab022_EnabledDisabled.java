package com.thetestingacademy.ex_04_TestNGExamples;

import org.testng.annotations.Test;

public class Lab022_EnabledDisabled {
    @Test
    public void test1()
    {
        System.out.println("Test1");
    }

    @Test(enabled = false)
    public void test2()
    {
        System.out.println("Test2");
    }

    @Test
    public void test3()
    {
        System.out.println("Test3");
    }
}
