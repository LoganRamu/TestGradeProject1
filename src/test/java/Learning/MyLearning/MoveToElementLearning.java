package Learning.MyLearning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MoveToElementLearning
{
    public static void main(String args[])
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.softwaretestingmaterial.com/category/tutorial/");
        WebElement ele1=driver.findElement(By.xpath("//span[text()='Tutorials']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(ele1).perform();
        driver.findElement(By.linkText("Java")).click();
        //or //li[@id='menu-item-17000']
        String str1=driver.getCurrentUrl();
        System.out.println(str1);
        }

    }

