package Learning.InterviewQuestions;

import io.cucumber.plugin.event.Node;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JsonReadTest {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser=new JSONParser();
        FileReader file=new FileReader("Test11.json");
        Object parse = jsonParser.parse(file);

        JSONObject jsonObject= (JSONObject) parse;
        String number= (String) jsonObject.get("Num");
        String name= (String) jsonObject.get("Name");
        JSONArray jsonArray= (JSONArray) jsonObject.get("Vehicles");

        System.out.println(number);
        System.out.println(name);

        Iterator iterator=jsonArray.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
