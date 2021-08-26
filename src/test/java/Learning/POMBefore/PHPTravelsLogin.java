package Learning.POMBefore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTravelsLogin
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://www.phptravels.net/login");
        Thread.sleep(5000);
        WebElement cookiesAccept=driver.findElement(By.id("cookie_stop"));
        if(cookiesAccept.isDisplayed()) {
            cookiesAccept.click();
        }
        WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Email']"));
        userName.sendKeys("user@phptravels.com");
        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("demouser");
        WebElement loginBtn=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        //driver.findElement(By.)

        loginBtn.click();
    }

}
