package Learning.AlertLearning;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Confirmation {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://letcode.in/alert");
        driver.findElement(By.xpath("//button[normalize-space(@class='button is-fullwidth is-link')][contains(text(),'Confirm Alert')]")).click();
        Alert alert=driver.switchTo().alert();
        String actualMessage=alert.getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualMessage,"Are you happy with LetCode");
       Assert.assertEquals("Are you happy with LetCode?",actualMessage);

       alert.accept();
    }
}
