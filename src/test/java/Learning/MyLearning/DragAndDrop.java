package Learning.MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://letcode.in/dropable");
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement dest=driver.findElement(By.id("droppable"));
        Actions act=new Actions(driver);
        act.dragAndDrop(source,dest).perform();
    }
}
