package Learning.AlertLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class WinAthuUsingChromeExtension {
    public static void main(String[] args) {
        File file=new File("Auth.crx");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addExtensions(file);

        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("chrome-extension://enhldmjbphoeibbpdhmjkchohnidgnah/popin.html");
        driver.findElement(By.xpath("//input[@id='url']")).sendKeys("https://the-internet.herokuapp.com/basic_auth");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@class='credential-form-submit']")).click();
        driver.get("https://the-internet.herokuapp.com/basic_auth");

    }
}
