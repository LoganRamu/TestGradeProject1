package Learning.PermissionPop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BypassPopup {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.addArguments("disable-geolocation");
        options.addArguments("disable-media-stream");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");




      /* WebElement ele=driver.findElement(By.xpath(""));

        Actions actions=new Actions(driver);
        actions.contextClick(ele);
        actions.doubleClick();
        actions.moveToElement(ele);*/


    }

}
//Above code will bypass the Allow popup