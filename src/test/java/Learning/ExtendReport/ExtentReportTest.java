package Learning.ExtendReport;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;

public class ExtentReportTest
{
    public static void main(String[] args) throws IOException {
        ExtentSparkReporter extentHtmlReporter=new ExtentSparkReporter("ExtentReportHTML.html");
        ExtentReports extentReports=new ExtentReports();
        extentReports.attachReporter(extentHtmlReporter);

        ExtentTest test1 = extentReports.createTest("Testcase001");
        test1.pass("Login Google URL ");
        test1.pass("Search selenium");
        test1.pass("Verify result");

        ExtentTest test2 = extentReports.createTest("Testcase002");
        test2.pass("Login Gmail URL ");
        test2.pass("Login ");
        test2.fail("Verify mail", MediaEntityBuilder.createScreenCaptureFromPath("joker.jpg").build());

        extentReports.flush();




    }

}

