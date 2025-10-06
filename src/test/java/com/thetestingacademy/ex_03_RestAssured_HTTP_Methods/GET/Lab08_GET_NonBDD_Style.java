package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab08_GET_NonBDD_Style {
    RequestSpecification r; // which is same as given
    Response response; // which is same as when
    ValidatableResponse vr;// which is same as then

    @Test
    public void test_GET_Non_BDD() {
        // given
        String Pincode = "110048";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");// you don't want to use dot.dot you can use
        // Reference name with dot
        r.basePath("/IN/" + Pincode);

        //when
        response = r.when().log().all().get();
        System.out.println(response.asString());// you can print response as a String

        //then
        vr = response.then().log().all().statusCode(200);
        vr.statusCode(200);
    }

        //In Non-Bdd we will take the Interface references
        // Non-Bdd is scalable if we want to reuse we can reuse for Negative Test case also

        @Test
        public void test_GET_Negative_Non_BDD()
        {
            // given
            String Pincode="@";
            r= RestAssured.given();
            r.baseUri("https://api.zippopotam.us");// you don't want to use dot.dot you can use
            // Reference name with dot
            r.basePath("/IN/" + Pincode);

            //when
            response=r.when().log().all().get();
            System.out.println(response.asString());// you can print response as a String

            //then
            vr=response.then().log().all().statusCode(404);
            vr.statusCode(404);
    }
}
