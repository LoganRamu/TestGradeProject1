package Learning.POMwithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PHPPageUsingPF
{
    @FindBy(how= How.ID,using="cookie_stop")
    public static WebElement cookies;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public static WebElement user;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public static WebElement pass;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public static WebElement button;

    @FindBy(xpath = "")
   public static List<WebElement> headers;
}


   /* public static WebElement acceptAllCookies(WebDriver driver)
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
        return loginBtn;*/