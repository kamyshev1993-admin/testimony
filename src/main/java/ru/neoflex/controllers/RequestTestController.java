package ru.neoflex.controllers;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import ru.neoflex.model.IRequest;

import static io.restassured.RestAssured.given;

public class RequestTestController {

    public static Response getResponse(String url, IRequest request) {
        return given()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post(url)
                .then()
                .extract()
                .response();
    }

    public static int getRequestCode(String url, String value) {
        return given()
                .get(url + "/" + value)
                .getStatusCode();
    }
}
