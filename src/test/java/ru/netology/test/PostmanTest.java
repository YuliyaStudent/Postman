package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanTest {

    @Test
    public void PostmanTest (){
                given()
                .baseUri("https://postman-echo.com")
                .body("Hello,world!") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello,world!"))
        ;
    }
}
