package Learning.MyLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class ButtonProperties
{
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://letcode.in/buttons");
        Point point=driver.findElement(By.id("position")).getLocation();
        int x=point.getX();
        int y=point.getY();
        System.out.println("X--"+x+" And Y---"+y);
        WebElement btn1 =driver.findElement(By.id("color"));
        System.out.println(btn1.getCssValue("background-color"));
        driver.quit();

    }

}
