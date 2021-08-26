package Learning.JsonFile;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.json.Json;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/*{
"Name":"Logan".
"Age":30
"Experience":{"Automation","Manual"}

        }*/

public class JsonWrite {
    public static void main(String[] args) throws IOException, ParseException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "Logan");
        jsonObject.put("Age", 30);

        JSONArray array = new JSONArray();
        array.add("Automation");
        array.add("Manual");
        jsonObject.put("Experience", array);

        FileWriter fileWriter = new FileWriter("SampleJSON.json");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(jsonObject.toJSONString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
