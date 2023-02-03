
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void ShouldReturnData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("I'm hungry")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("I'm hungry"))
        ;
    }
}
