package Learning.SudhanDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SpiceJetEnableAllCheckbos {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String URL = "https://www.spicejet.com/";
        driver.get(URL);

        String currentURL = driver.getCurrentUrl();

        if (currentURL.contains("beta")) {
            driver.get(URL);
        }
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='discount-checkbox']//following::input[@type='checkbox']"));
        for (WebElement allElements : elements) {
            allElements.click();
        }
    }
}
