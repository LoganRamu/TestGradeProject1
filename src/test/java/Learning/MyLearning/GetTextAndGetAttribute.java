package Learning.MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {
    //Get attribute
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://letcode.in/edit");
        String attName=driver.findElement(By.id("join")).getAttribute("type");
        System.out.println(attName);
        driver.quit();
    }
}
