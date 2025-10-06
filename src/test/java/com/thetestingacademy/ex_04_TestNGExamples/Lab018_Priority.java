package com.thetestingacademy.ex_04_TestNGExamples;

import org.testng.annotations.Test;

public class Lab018_Priority {

        @Test(priority = 3)
       public void test_one()
        {
            System.out.println(1);
        }

    @Test(priority = 1)
    public void test_two()
    {
        System.out.println(2);
    }

    @Test(priority = 4)
    public void test_three()
    {
        System.out.println(3);
    }

    @Test(priority = 2)
    public void test_four()
    {
        System.out.println(4);
    }
    }

