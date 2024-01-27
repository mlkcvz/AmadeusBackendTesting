import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetFlightFirstCaseTests
{
    @Test
    public void getAllBookingTest() {
        //TEST CASE : GET istekleri 200 status code dönmeli
        given()
                .when()
                .get("https://flights-api.buraky.workers.dev/")
                .then()
                .log().all()
                .statusCode(200);
    }
}


