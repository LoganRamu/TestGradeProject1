package Learning.APIAutomationLearning.RestAssuredTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleGetRequest
{
    public static void main(String[] args) {

       //"https://www.google.com/";

        Response restResponse = RestAssured.get("https://reqres.in/api/users/2");
        int statusCode = restResponse.getStatusCode();
        String statusLine = restResponse.getStatusLine();
        System.out.println("Status code--"+statusCode);
        System.out.println(statusLine);

        ResponseBody body = restResponse.getBody();

        System.out.println(body.asString());
        System.out.println(body.asPrettyString());


    }
}
