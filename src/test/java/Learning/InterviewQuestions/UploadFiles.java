package Learning.InterviewQuestions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFiles {
    public static void main(String[] args) throws AWTException, InterruptedException {

        //Approach 1: If <input type='file'> then we can use send keys
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.monsterindia.com/seeker/registration");
        /*WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\Admin\\Documents\\Document.txt");
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//input[@name='file']"))));
        String uploadFileName = driver.findElement(By.xpath("//p[normalize-space()='Document.txt']")).getText();
        System.out.println(uploadFileName);
        if (uploadFileName.equals("Document.txt")) {
            System.out.println("File uploaded successfully");
        }

        driver.findElement(By.linkText("Remove")).click();
        Thread.sleep(3000);*/
        WebElement uploadButton = driver.findElement(By.xpath("//span[@class='browse-text']"));
        uploadButton.click();

        //Approach 2 using Copy paste method
        StringSelection stringSelection=new StringSelection("C:\\Users\\Admin\\Documents\\Document.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Actions actions=new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();





    }
}
