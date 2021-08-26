package Learning.JsonFile;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.io.FileHandler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JsonRead {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonparser = new JSONParser();//Create a Obj for JSON parser
        FileReader fileReader = new FileReader("SampleJSON.json");//File
        Object parsedObj = jsonparser.parse(fileReader);
        //Object is a grant parent class
        //We need get method, Object doesn't have
        //we need to convert Object class to JSONObject

        JSONObject jsonObject = (JSONObject) parsedObj;//type case to JSON
        String name = (String) jsonObject.get("Name");
        long age = (long) jsonObject.get("Age");
        JSONArray array = (JSONArray) jsonObject.get("Experience");

        System.out.println("Name---" + name);
        System.out.println("Age---" + age);
        Iterator iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println("Exp---" + iterator.next());
        }


    }
}
