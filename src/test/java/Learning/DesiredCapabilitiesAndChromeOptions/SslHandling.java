package Learning.DesiredCapabilitiesAndChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslHandling {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        //Global config
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        //Merge above config to Chrome
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.merge(dc);
        //chromeOptions.addArguments("--disable-popup-blocking");

        //dc.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
        driver=new ChromeDriver(chromeOptions);
        driver.get("https://expired.badssl.com");
        //String title=driver.getTitle();
        //System.out.println(title);
        Thread.sleep(1000);
        //driver.quit();


    }
}
//SSl handling in Safari browser only thru JavascriptExecutor
