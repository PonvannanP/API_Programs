package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab07_GET_BDD_Style {
    @Test
    public void test_GET_POSITIVE_TC1() {
        String Pincode = "110048"; // Valid pincode
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + Pincode)
                .when().log().all() // log.all is used displaying the message in Console
                .get()
                .then()
                .log().all()
                .statusCode(200); // ✅ Expecting success
    }
}
