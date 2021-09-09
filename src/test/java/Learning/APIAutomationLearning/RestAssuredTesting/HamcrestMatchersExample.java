package Learning.APIAutomationLearning.RestAssuredTesting;

import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers;
import org.hamcrest.Matchers;
import org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

public class HamcrestMatchersExample
{
    public static void main(String[] args) {
        RestAssured.baseURI="";

       RestAssured.given().when().get("https://reqres.in/api/users/2")
                .then()
                .body("data.id", Matchers.equalTo(2));

       RestAssured.given().get("https://reqres.in/api/users/2")
                .then()
                .body("data.email",Matchers.equalTo("janet.weaver@reqres.in"));

        RestAssured.given().get("")
                .then().time(Matchers.lessThan(1L),TimeUnit.MINUTES);
    }
}
