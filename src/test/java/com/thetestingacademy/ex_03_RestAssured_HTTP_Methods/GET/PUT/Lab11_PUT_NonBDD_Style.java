package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.GET.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab11_PUT_NonBDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr1;

    @Test
    public void test_put_non_bdd() {
        String bookingid = "2216";// By using Post request we have created booking id
        String token = "408bdcb1c7672c7";// By using Create Token weh have created token

        String payloadPUT = "{\n" +
                "    \"firstname\" : \"James\",\n" + // In firstname we are updating with james
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
               //Given
               r= RestAssured.given();
               r.baseUri("https://restful-booker.herokuapp.com");
               r.basePath("/booking/"+bookingid);
               r.contentType(ContentType.JSON);
               r.cookie("token",token);// Cookies=token(The cookie which we are getting from POST request)
               r.body(payloadPUT).log().all();

               // when
               response=r.when().log().all().put();

               //then
        vr1=response.then().log().all();
        vr1.statusCode(200);


    }
}

