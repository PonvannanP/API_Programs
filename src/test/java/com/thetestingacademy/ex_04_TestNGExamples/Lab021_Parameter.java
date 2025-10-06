package com.thetestingacademy.ex_04_TestNGExamples;

import org.apache.groovy.json.internal.Value;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab021_Parameter {
    @Parameters("browser")
    @Test
    public void demo(String value) {
        System.out.println("Demo");

        if(value.equalsIgnoreCase("Firefox"))
        {
            System.out.println("Firefox will be executed");
        }

        if(value.equalsIgnoreCase("Chrome"))
        {
            System.out.println("Chrome will be executed");
        }
    }
}
