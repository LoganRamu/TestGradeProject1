package Learning.InterviewQuestions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class AngularJSPageAutomationExample {

    public static void main(String[] args) throws AWTException, InterruptedException {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(chromeOptions);

        //driver.navigate().to("https://juliemr.github.io/protractor-demo/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.location='https://juliemr.github.io/protractor-demo/'","");
       // driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//form[@class='form-inline ng-pristine ng-valid']//descendant::input[1]")).sendKeys("1");

        driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("2");

        driver.findElement(By.xpath("//button[@id='gobutton']")).click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        //Thread.sleep(5000);
       WebElement result =driver.findElement(By.tagName("h2"));
        Pattern pattern=Pattern.compile("\\d+");
        wait.until(ExpectedConditions.textMatches(By.tagName("h2"),pattern));
        System.out.println(result.getText());

        //Approach 1: Thread.sleep();
        //Approach 2: we can use untill.textmatches in exp wait

    }
}

/*This Angular page Gives answer as 3 , but before that it loads for some time with dashes (-----). if we try to print inly we get - to print
We can use Thread.sleep(), no otr wait works here
or we can use untill.textmatches in exp wait
* */
