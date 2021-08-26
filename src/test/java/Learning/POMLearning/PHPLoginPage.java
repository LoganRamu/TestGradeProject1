package Learning.POMLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PHPLoginPage {


    public static WebElement acceptAllCookies(WebDriver driver)
    {
        WebElement cookiesAccept = driver.findElement(By.id("cookie_stop"));
        return cookiesAccept;
    }
    public static WebElement user(WebDriver driver)
    {
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        return userName;
    }
    public static WebElement pass(WebDriver driver)
    {
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        return password;
    }
    public static WebElement clickLogin(WebDriver driver)
    {
        WebElement loginBtn = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        return loginBtn;
    }
}

