package com.thetestingacademy.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Lab02_RA_BuilderPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Pincode :");
        String Pincode=sc.next();



        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}
