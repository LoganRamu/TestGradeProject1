package Learning.DesiredCapabilitiesAndChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoWindow
{
    public static void main(String[] args) {
        WebDriver driver;
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        driver=new ChromeDriver(chromeOptions);
        driver.get("https://google.com");
    }




}
