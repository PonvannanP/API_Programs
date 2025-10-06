package com.thetestingacademy.ex_05_TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab026_TestNGAssertions {
    @Test(enabled = false)
    public void test_hard()
    {
        System.out.println("Start of the Program");
        Assert.assertEquals("Pon","poin");
        System.out.println("End of the Program");
    }

    @Test
    public void test_soft()
    {
        System.out.println("Start of the Program");
        SoftAssert sf=new SoftAssert();
        sf.assertEquals("Pon","poin");
        System.out.println("End of the Program");
        sf.assertAll();// It will check all the Assertions


    }
}
