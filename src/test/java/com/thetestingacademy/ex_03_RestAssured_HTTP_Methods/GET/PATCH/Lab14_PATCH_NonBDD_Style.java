package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.GET.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab14_PATCH_NonBDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr1;

    @Test
    public void test_patch_non_bdd() {
        String bookingid = "2152";// By using Post request we have created booking id
        String token = "53a8edd41276b15";// By using Create Token weh have created token

        String payloadPUT = "{\n" +
                "    \"firstname\" : \"Pon\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";
        //Given
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);// Cookies=token(The cookie which we are getting from POST request)
        r.body(payloadPUT).log().all();

        // when
        response=r.when().log().all().patch();

        //then
        vr1=response.then().log().all();
        vr1.statusCode(200);


    }
}

