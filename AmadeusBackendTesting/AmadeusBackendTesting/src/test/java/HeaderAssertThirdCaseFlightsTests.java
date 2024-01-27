import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeaderAssertThirdCaseFlightsTests
{
    //TEST CASE: Header kontrolü
    //GET isteklerinden gelen response’un içinde “Content-Type” header’ı olmalı ve
    // değeri “application/json” olmalı.
    @Test
    public void createFlightsTest()
    {

        RestAssured.baseURI = "https://flights-api.buraky.workers.dev/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");

        String contentType = response.header("Content-Type");
        System.out.println("Content-Type value: " + contentType);
        Assertions.assertEquals("application/json", contentType);



    }
    }

