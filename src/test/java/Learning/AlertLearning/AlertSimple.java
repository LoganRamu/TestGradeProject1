package Learning.AlertLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSimple
{

    public static void main (String args[]) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://letcode.in/alert");
        driver.findElement(By.id("accept")).click();
        //Alert alert=driver.switchTo().alert();
        //alert.accept();

        /*WebDriverWait wait=new WebDriverWait(driver,20);

        Alert until = wait.until(ExpectedConditions.alertIsPresent());
        until.accept();
        until.dismiss();
        until.getText();
        until.sendKeys("");*/
    }

}

