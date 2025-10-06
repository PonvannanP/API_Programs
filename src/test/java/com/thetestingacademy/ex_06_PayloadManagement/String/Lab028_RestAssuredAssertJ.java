package com.thetestingacademy.ex_06_PayloadManagement.String;

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
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Lab028_RestAssuredAssertJ {


    RequestSpecification r;
    Response response;
    ValidatableResponse validatableResponse;
    String token;
    Integer bookingID;


    @Owner("Jim")
    @Severity(SeverityLevel.CRITICAL)
    @Description("TC#1 Verify the Created booking is working,booking id is not null")
    @Test
    public void test_createBooking_POST() {
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
        r.body(Payload).log().all();

        System.out.println("---Part2---");

        //when(Making HTTP Request)
        response = r.when().log().all().post();

        System.out.println("---part3");

        //then(Verification Part)
        validatableResponse = response.then().log().all().statusCode(200);
        validatableResponse.statusCode(200);

        // How to verify firstname==Jim, lastname==Brown
        // Booking is not NULL from response
        // Depositpaid should be false
        // bookingid is not Null

        validatableResponse.body("booking.firstname", Matchers.equalTo("Jim"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Brown"));
        validatableResponse.body("booking.depositpaid", Matchers.equalTo(true));
        validatableResponse.body("bookingid", Matchers.notNullValue());// bookingid we can
        // get directly

        //Extracting the path of BookingId,Firstname and Lastname using JSONPathFinder

        bookingID=response.then().extract().path("bookingid");
        String firstname=response.then().extract().path("booking.firstname");
        String lastname=response.then().extract().path("booking.lastname");

        // TestNG hard Assertions
        Assert.assertEquals(firstname,"Jim");
        Assert.assertEquals(lastname,"Jim");
        Assert.assertNotNull(bookingID);

        //In TestNG we need to validate one by one in One Go there is no possible

        //AssertJ(3rd party library)
        assertThat(bookingID).isNotNull().isNotZero().isPositive();// We can use Continuous
        // dot Operator( Three assertions in one line)
        assertThat(firstname).isEqualTo("Jim").isNotBlank().isNotEmpty().isNotNull();
        // Difference between Blank and Empty
        // String s1=""->Empty
        // String s2=" "->Blank(Space is also blank)


// hard assertions is mainly used in AssertJ



    }
}
