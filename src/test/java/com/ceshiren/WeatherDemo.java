package com.ceshiren;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class WeatherDemo {
    @Test
    void WeatherTest(){
        String key="968a297d2e7c783201f55a49e754bd49";
        String city="0751";
        String weatherUrl = "https://restapi.amap.com/v3/weather/weatherInfo";
        String data=given()
                .param("key",key).param("city",city)
                .when().get(weatherUrl)
                .then().log().all()
                .extract().body().path("live[0].weather");
        System.out.println(data);
    }

    /*String cityRes=data.get("city");
    String provinceRes=data.get("province");
    String weatherRes=data.get("weather");
    String outPutText="hyh hometown is"+provinceRes+"省"+cityRes+"市"+weatherRes;*/

}
   /* String data = "{\"text\": \"内容\", \"chatId\": \"6302f9742f47ac820b6a6435\", \"robotId\": \"5f5b0a483ac0b2003eed286f\"}";
    given().contentType("application/json").body(data).log().all()
    .when().post("http://39.102.48.202:6001/api/warning/send").then().log().all();*/
