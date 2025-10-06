package com.thetestingacademy.ex_04_TestNGExamples;

import org.testng.annotations.Test;

public class Lab020_DependsonMethod {
    @Test
    public void serverStarted()
    {
        System.out.println("Server should be started");
    }

    @Test(dependsOnMethods = "serverStarted")
    public void test1()
    {
        System.out.println("Test1");
    }

    @Test(dependsOnMethods = "serverStarted")
    public void test2()
    {
        System.out.println("Test2");
    }
}
