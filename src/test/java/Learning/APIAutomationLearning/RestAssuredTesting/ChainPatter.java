package Learning.APIAutomationLearning.RestAssuredTesting;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class ChainPatter
{
    public static void main(String[] args) {
        /*Response response=RestAssured.get("http://localhost:3000/employees");

        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();

        ResponseBody body=response.getBody();

        System.out.println(body.asPrettyString());*/


        RestAssured.baseURI="http://localhost:3000";

        ValidatableResponse validatableResponse = given().param("", "").header("", "")
                .when()
                .get("/employees")
                .then().statusCode(200);

        System.out.println(validatableResponse);
        //if we use then we have to ValidatableResponse
    }
}
