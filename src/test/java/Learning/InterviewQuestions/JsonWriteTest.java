package Learning.InterviewQuestions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonWriteTest {
    public static void main(String[] args) throws IOException, AWTException {


        JSONObject jsonObject=new JSONObject();
        jsonObject.put("Num","1");
        jsonObject.put("Name","Logan");
        JSONArray jsonArray=new JSONArray();
        jsonArray.add("Car");
        jsonArray.add("Bike");
        jsonObject.put("Vehicles",jsonArray);

        FileWriter fileWriter=new FileWriter("Test11.json");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(jsonObject.toJSONString());
        bufferedWriter.flush();
        bufferedWriter.close();




    }
}
