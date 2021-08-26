package Learning.MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandlesLearning {
    public static void main(String args[])
    {
        WebDriver driver;
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        String mainWindow=driver.getWindowHandle();
        WebElement bt1=driver.findElement(By.xpath("//button[@id='tabButton']"));
        bt1.click();
        Set<String> winhandels=driver.getWindowHandles();
        System.out.println(winhandels);
        List<String> ls=new ArrayList<>(winhandels);
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(ls.get(1));
        driver.close();
    }
}
