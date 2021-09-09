package Learning.APIAutomationLearning.RestAssuredTesting;


import io.restassured.RestAssured;
import org.json.simple.JSONObject;

public class PostExample
{
    public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000";


        JSONObject jsonObject=new JSONObject();
        jsonObject.put("first_name","Logan5");
        jsonObject.put("last_name","Test5");
        jsonObject.put("email","test4@demo.com");


        RestAssured.given().header("Content-Type","application/json")
                .body(jsonObject.toJSONString())
                .when().post("/employees")
                .then().statusCode(201);

    }
}
