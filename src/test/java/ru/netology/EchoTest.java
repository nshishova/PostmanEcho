package ru.netology;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoTest {
    @Test
    void shouldReturnData() {
        String data = "Hello";
        given()
                .baseUri("https://postman-echo.com")
                .body(data)

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo(data))
        ;
    }


}
