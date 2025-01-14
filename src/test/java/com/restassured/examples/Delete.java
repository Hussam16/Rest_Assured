package com.restassured.examples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Delete {

    public static void main(String[] args) {
        RequestSpecification requestSpecfic = RestAssured.given();
        requestSpecfic.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecfic.basePath("auth");
        requestSpecfic.contentType(ContentType.JSON);
        requestSpecfic.body("{\r\n"
                + "    \"username\" : \"admin\",\r\n"
                + "    \"password\" : \"password123\"\r\n"
                + "}");

        //requestSpecfic.log().all();

        Response response = requestSpecfic.post();
        ValidatableResponse validateResponse = response.then();
        validateResponse.statusCode(200);


        RequestSpecification requestSpecfic_1 = RestAssured.given();
        requestSpecfic_1.baseUri("https://run.mocky.io/v3");
        requestSpecfic_1.basePath("/fae41c99-2bee-43fc-8215-91b9ea48c1ca");
        requestSpecfic_1.log().all();
        Response response_2 = requestSpecfic_1.get();

        System.out.println(response_2.getStatusCode());

        RestAssured
                .given()
                .baseUri("https://api.restful-api.dev/objects")
                .pathParam("id",7)
                .get("/{id}").prettyPrint();


        Data data = RestAssured
                .given()
                .baseUri("https://run.mocky.io/v3/855cbb54-9612-41da-be2a-9354c8c62aa9")
                .get().jsonPath().getObject("data", Data.class);

        System.out.println(data.getId());











    }






}
