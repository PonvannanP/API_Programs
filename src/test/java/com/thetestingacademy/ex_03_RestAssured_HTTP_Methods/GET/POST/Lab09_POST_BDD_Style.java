package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.GET.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab09_POST_BDD_Style {
    @Test
    public void test_POST_Auth()
    {
        // URL->https://restful-booker.herokuapp.com/auth
        // Payload-> '{
        //    "username" : "admin",
        //    "password" : "password123"
        //}'
        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
               .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payload)// we are passing the payload from the Post request
                .when().// log.all is basically used to check what are the messages we are using
                // in Console basically it is logging whatever we are doing
                log()
                .all().post()
                .then().log()
                .all().statusCode(200);
    }
}
