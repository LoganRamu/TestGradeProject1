package Learning.WaitLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImWaitLearning {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.findElement(By.xpath("//a[contains(text(),'Work Space')]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }

}
