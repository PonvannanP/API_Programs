package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.GET.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Lab10_POST_NonBDD_Style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr1;

    public void test_Non_BDD_Create_Token()
    {
        // Payload
        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println("---Part1---");

        //given(PreCondition preparing request)
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        System.out.println("---Part2---");

        //when(Making HTTP Request)
        response=r.when().log().all().post();

        System.out.println("---part3");

        //then(Verification Part)
        vr1=response.then().log().all().statusCode(200);
        vr1.statusCode(200);



    }
}
