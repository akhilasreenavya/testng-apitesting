package com.apimethods;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class PostRequest {
    public void post() {

        JSONObject request = new JSONObject();
        request.put("name", "chaya");
        request.put("job", "BA");

        System.out.println(request);
        System.out.println(request.toString());

        given().
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().statusCode(201 );

    }
}
