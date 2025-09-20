package com.thetestingacademy.ex_01_RA_Basics;

import io.restassured.RestAssured;

public class Lab01_RA_BuilderPattern {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/apidoc/index.html#api-Ping-Ping")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }

}
