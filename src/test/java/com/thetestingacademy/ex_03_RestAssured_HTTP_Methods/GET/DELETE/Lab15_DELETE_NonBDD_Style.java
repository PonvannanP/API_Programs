package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.GET.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab15_DELETE_NonBDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr1;

    @Test
    public void test_delete_non_bdd() {
        String bookingid = "426";// By using Post request we have created booking id
        String token = "19b46e98439433f";// By using Create Token weh have created token


        //Given
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);// Cookies=token(The cookie which we are getting from POST request)

        // For delete we don't require a payload only Token and booking Id is needed

        // when
        response = r.when().log().all().delete();

        //then
        vr1 = response.then().log().all();
        vr1.statusCode(201);

    }
}
