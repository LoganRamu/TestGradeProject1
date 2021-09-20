package Learning.InterviewQuestions;

import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionsExample {
    public static void main(String[] args) throws AWTException {

        WebDriver driver=new ChromeDriver();
        /*driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("");
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.chord(Keys.CONTROL,"a")).perform();
        actions.sendKeys();*/

        driver.get("https://www.flipkart.com/");

        Point location = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).getLocation();
        int xValue=location.getX();
        int yValue=location.getY();
        Actions actions=new Actions(driver);
        actions.moveByOffset(xValue,yValue).click().perform();
        //button1.click();

        /*WebElement search=driver.findElement(By.xpath("//div[@class='_3OO5Xc']//child::input"));
        actions.keyDown(search,Keys.SHIFT).sendKeys("headphone").keyUp(search,Keys.SHIFT).sendKeys(Keys.ENTER).perform();*/

        Robot robot=new Robot();
        driver.findElement(By.xpath("//div[@class='_3OO5Xc']//child::input")).sendKeys("");
        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
