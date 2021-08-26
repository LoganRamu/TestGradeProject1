package Learning.RefreshPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshTypes
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //driver.navigate().to("https://www.google.com/");
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        //driver.navigate().refresh();
        //driver.get(driver.getCurrentUrl());

        //Using Js

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("location.reload()");//history.go(0);


    }

}
