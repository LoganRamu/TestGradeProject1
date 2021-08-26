package Learning.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory
{
    WebDriver driver;
    PropertyReader propertyReader=new PropertyReader();
    public BrowserFactory()
    {
        setDriver();
    }
    public void setDriver()
    {
        String browser=propertyReader.getProperty("browser");
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver=chrome();
            maximize();
        }
    }
private WebDriver chrome()
{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
    return new ChromeDriver();
}

    public WebDriver driverReturn()
    {
        return driver;
    }

    public void maximize()
    {
        driver.manage().window().maximize();
    }

}
