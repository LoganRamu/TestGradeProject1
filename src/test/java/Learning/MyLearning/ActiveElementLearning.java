package Learning.MyLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class ActiveElementLearning
{
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement activeElement=driver.switchTo().activeElement();
        activeElement.sendKeys("logangru@gmail.com", Keys.TAB, "password11",Keys.ENTER);
        driver.quit();
    }
}
