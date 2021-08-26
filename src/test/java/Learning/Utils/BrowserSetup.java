package Learning.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup
{
    WebDriver driver;
    public WebDriver chrome()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        return new ChromeDriver();
    }
}
