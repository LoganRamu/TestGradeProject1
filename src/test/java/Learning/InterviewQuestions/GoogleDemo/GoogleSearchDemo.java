package Learning.InterviewQuestions.GoogleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchDemo
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("selenium \n");
        driver.findElement(By.xpath("//div[@class='r21Kzd']")).click();
        //Thread.sleep(3000);
        WebElement link1=driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']//following::cite[3]"));
        //String url=link1.getAttribute("innerText");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        String url1=(String) js.executeScript(" return arguments[0].text",link1);
        System.out.println(url1);

    }
}
