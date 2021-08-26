package Learning.POMLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTrLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/login");
        Thread.sleep(3000);
        if(PHPLoginPage.acceptAllCookies(driver).isDisplayed())
        {
            PHPLoginPage.acceptAllCookies(driver).click();
        }
        PHPLoginPage.user(driver).sendKeys("user@phptravels.com");
        PHPLoginPage.pass(driver).sendKeys("demouser");
        PHPLoginPage.clickLogin(driver).click();
    }
}