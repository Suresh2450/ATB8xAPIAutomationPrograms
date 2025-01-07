package SnapWork.com;

import io.restassured.RestAssured;

public class APITest002 {
    public static void main(String[] args) {

//        Gherkin Syntax

//        FullURL - https://restful-booker.herokuapp.com/booking/1
//        BaseURL - https://restful-booker.herokuapp.com
//        BasePath - /booking/1

        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
        .basePath("/booking/1")
                .when().get()
                .then().log().all()
                .statusCode(200);
    }
}
