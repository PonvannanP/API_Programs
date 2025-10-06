package com.thetestingacademy.ex_06_PayloadManagement.HashMap;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab029_RestAssuredHashMap {

    RequestSpecification r;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void test() {
        //String Payload = "{\n" +
        //                "    \"firstname\" : \"Jim\",\n" +
        //                "    \"lastname\" : \"Brown\",\n" +
        //                "    \"totalprice\" : 111,\n" +
        //                "    \"depositpaid\" : true,\n" +
        //                "    \"bookingdates\" : {\n" +
        //                "        \"checkin\" : \"2018-01-01\",\n" +
        //                "        \"checkout\" : \"2019-01-01\"\n" +
        //                "    },\n" +
        //                "    \"additionalneeds\" : \"Breakfast\"\n" +
        //                "}";

        // HashMap key and value pair
        //ParenthashMap
        Map<String, Object> jsonParent = new LinkedHashMap<>();
        jsonParent.put("firstname", "Jim");
        jsonParent.put("lastname", "Brown");
        jsonParent.put("totalprice", 111);
        jsonParent.put("depositpaid", true);


        //ChildHashMap
        Map<String, Object> child = new LinkedHashMap<>();
        child.put("checkin", "2018-01-01");
        child.put("checkout", "2019-01-01");

        jsonParent.put("bookingdates" ,child);
        jsonParent.put("additionalneeds" ,"breakfast");
        System.out.println(jsonParent);

        // In Output:
        // This HashMap looks like a JSON, But this is not a JSON
        // {
        // firstname=Jim,
        // lastname=Jim,
        // totalprice=111,
        // depositpaid=true,
        // bookingdates=Map1,
        // additionalneeds=Breakfast
        // }

        RequestSpecification r;
        Response response;
        ValidatableResponse validatableResponse;
        String token;
        Integer bookingID;




            //String payload
            String Payload = "{\n" +
                    "    \"firstname\" : \"Jim\",\n" +
                    "    \"lastname\" : \"Brown\",\n" +
                    "    \"totalprice\" : 111,\n" +
                    "    \"depositpaid\" : true,\n" +
                    "    \"bookingdates\" : {\n" +
                    "        \"checkin\" : \"2018-01-01\",\n" +
                    "        \"checkout\" : \"2019-01-01\"\n" +
                    "    },\n" +
                    "    \"additionalneeds\" : \"Breakfast\"\n" +
                    "}";

            r = RestAssured.given();
            r.baseUri("https://restful-booker.herokuapp.com");
            r.basePath("/booking");
            r.contentType(ContentType.JSON);
            r.body(jsonParent).log().all();// Using the hashmap body reference name

            System.out.println("---Part2---");

            //when(Making HTTP Request)
            response = r.when().log().all().post();

            System.out.println("---part3");

            //then(Verification Part)
            validatableResponse = response.then().log().all();
            validatableResponse.statusCode(200);

            // How to verify firstname==Jim, lastname==Brown
            // Booking is not NULL from response
            // Depositpaid should be false
            // bookingid is not Null

            validatableResponse.body("booking.firstname", Matchers.equalTo("Jim"));
            validatableResponse.body("booking.lastname", Matchers.equalTo("Brown"));
            validatableResponse.body("booking.depositpaid", Matchers.equalTo(true));
            validatableResponse.body("bookingid", Matchers.notNullValue());


        }


    }

