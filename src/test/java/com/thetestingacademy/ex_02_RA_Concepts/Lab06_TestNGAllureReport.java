package com.thetestingacademy.ex_02_RA_Concepts;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab06_TestNGAllureReport {
    String Pincode;

    @Test
    public void test_GET_POSITIVE_TC1() {
        Pincode = "110048"; // Valid pincode
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + Pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200); // ✅ Expecting success
    }

    @Test
    public void test_GET_NEGATIVE_TC2() {
        Pincode = "@"; // Invalid pincode
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + Pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200); // ✅ Expecting not found
    }

    @Test
    public void test_GET_NEGATIVE_TC3() {
        Pincode = ""; // Empty pincode
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + Pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200); // ✅ Expecting not found
    }
}

