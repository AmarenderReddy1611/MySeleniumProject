package com.qa.banking.TestCases;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class APITest {

        @Test
        public void testGetRequest() {
            RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
            given()
                    .when()
                    .get("/posts/1")
                    .then()
                    .statusCode(200)
                    .body("userId", equalTo(1))
                    .body("id", equalTo(1))
                    .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                    .body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
        }

}
