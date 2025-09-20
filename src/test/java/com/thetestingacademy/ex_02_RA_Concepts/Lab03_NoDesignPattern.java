package com.thetestingacademy.ex_02_RA_Concepts;

public class Lab03_NoDesignPattern {
    //NoDeignPattern
    public void step1()
    {
        System.out.println("Step1");
    }

    public void step2()
    {
        System.out.println("Step2");
    }

    public void step3(String name)
    {
        System.out.println("Step3");
    }
    public static void main(String[] args) {
        Lab03_NoDesignPattern NP1=new Lab03_NoDesignPattern();
        NP1.step1();

        Lab03_NoDesignPattern NP2=new Lab03_NoDesignPattern();
        NP1.step2();

        Lab03_NoDesignPattern NP3=new Lab03_NoDesignPattern();
        NP1.step3("Postman");
    }
}
