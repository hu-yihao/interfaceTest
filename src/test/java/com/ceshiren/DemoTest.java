package com.ceshiren;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {
    @Test
    void req() {
        given()
                .header("name","huyihao")
                .header("age",18)
                .param("movie","Once Upon a Time in America").log().all()
                .when().get("https://httpbin.ceshiren.com/get").then();
    }
    @Test
    void response(){
        String resUrl=given().header("name","hyh")
                .when().get("https://httpbin.ceshiren.com/get")
                .then()
                .extract()
                .body().path("header.name");
                //.path("url");
                assertEquals("https://httpbin.ceshiren.com/get",resUrl);
    }

}
