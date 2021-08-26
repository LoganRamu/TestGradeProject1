package Learning.POMBefore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PHPTravelsProfile
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.get("https://www.phptravels.net/login");
        driver.manage().window().maximize();
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
        loginBtn.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()=' My Profile']")).click();
        driver.findElement(By.name("lastname")).sendKeys("Test");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement update= driver.findElement(By.xpath("//button[text()='Update Profile']"));
        wait.until(ExpectedConditions.visibilityOf(update));
        //update.click();
        System.out.println("Success");

    }
}
