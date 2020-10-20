package ru.neoflex.controllers;

import io.restassured.http.ContentType;
import ru.neoflex.model.IRequest;
import static io.restassured.RestAssured.given;

public class RequestTestController {

    public static int getRequestCode(String url, IRequest request) {
        return given()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post(url)
                .then()
                .extract()
                .response()
                .getStatusCode();
    }

    public static int getRequestCode(String url, String value) {
        return given()
                .get(url + "/" + value)
                .getStatusCode();
    }
}
