package Learning.InterviewQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RefreshBrowsers
{
    public static void main(String[] args) throws AWTException {
        WebDriver driver=new ChromeDriver();

        //Navigate
        driver.navigate().to("");
        driver.navigate().refresh();

        //Get
        driver.get("");
        driver.get(driver.getCurrentUrl());

        //Javascript

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("location.reload()");

        //Robot class

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyRelease(KeyEvent.VK_F5);


    }
}
