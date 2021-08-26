package Learning.MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class WebTableLearning1
{
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://letcode.in/table");
        driver.manage().window().maximize();
        List<WebElement> items = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[1]"));
        List<WebElement> price = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[2]"));
        for(int i=0;i<items.size();i++)
        {
            String itemName=items.get(i).getText();
            if(itemName.equals("Eggs"))
            {
                System.out.println(price.get(i).getText());
                break;
            }

        }


    }
}
