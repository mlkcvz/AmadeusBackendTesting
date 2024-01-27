import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.from;

public class GetFlightsSecondCaseTests {
    @Test
    public void getFlightsIdByTests() {
        //TEST CASE : GET isteklerinden şu yapıda bir cevap gelmeli

       /* Response res = given()
                .get("https://flights-api.buraky.workers.dev/");
       // JsonPath jsonPathEvaluator = res.jsonPath();*/
        // Assertions.assertEquals(model,jsonPathEvaluator.get("Ist"));

        //   RequestSpecification request = RestAssured.given();

        //  System.out.println("Response Body -> " + res.body().asString());

        // We can convert the Json Response directly into a Java Array by using

        RestAssured.baseURI = "https://flights-api.buraky.workers.dev/";
        Flight flight = new Flight();
        RequestSpecification http = RestAssured.given();
        Response response = http.request(Method.GET, "/3");


        Flight[] datas = response.jsonPath().getObject("$.datas.", Flight[].class);
        ResponseBody body = response.body();
        String bodyObj = body.asString();
        System.out.println(bodyObj);
        System.out.println(flight.getId());
        // Assertions.assertEquals(bodyObj.contains(flight.getId(),true,""));

        System.out.println(datas);
     /*   for(Flight d : datas)
        {
            System.out.println("flight title "+ d.getDate());
            Assertions.assertEquals("id",d.getId());
            Assertions.assertEquals("from",d.getFrom());
            Assertions.assertEquals("to",d.getTo());
            Assertions.assertEquals("date",d.getDate());
        }

    }*/


    }
}