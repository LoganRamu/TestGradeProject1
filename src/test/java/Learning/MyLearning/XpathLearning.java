package Learning.MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLearning
{
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//*[@name='txtUsername']"));
        driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]"));
        driver.findElement(By.xpath("//*[@type='submit'][@name='Submit'][@class='button']"));


    }
}
