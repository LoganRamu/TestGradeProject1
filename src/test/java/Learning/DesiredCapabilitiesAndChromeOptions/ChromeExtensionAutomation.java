package Learning.DesiredCapabilitiesAndChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ChromeExtensionAutomation
{
    public static void search(WebDriver driver)
    {
        driver.get("chrome-extension://mgijmajocgfcbeboacabfgobmjgjcoja/browser_action.html");
        driver.findElement(By.xpath("//*[@id='query-field']")).sendKeys("deferred", Keys.ENTER);
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement result=driver.findElement(By.xpath("//span[@class='headword']"));
        wait.until(ExpectedConditions.visibilityOf(result));
        String resultText=result.getText();
        System.out.println(resultText);
    }
    public static void main(String[] args) {

        WebDriver driver;
        ChromeOptions chromeOptions=new ChromeOptions();
        File file=new File("Chrome_Extension.crx");
        chromeOptions.addExtensions(file);
        driver=new ChromeDriver(chromeOptions);
        search(driver);
        driver.get("chrome-extension://mgijmajocgfcbeboacabfgobmjgjcoja/options.html");
        WebElement languageSelection=driver.findElement(By.xpath("//select[contains(@id,'language')]"));
        Select select=new Select(languageSelection);
        select.selectByVisibleText("French");
        String lan=select.getFirstSelectedOption().getText();
        System.out.println(lan);
        driver.findElement(By.xpath("//button[text()='Save']"));
        search(driver);
    }
}
