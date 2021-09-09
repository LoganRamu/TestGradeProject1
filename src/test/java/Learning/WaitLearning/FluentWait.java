package Learning.WaitLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        //FluentWait
        Wait<WebDriver> wait=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

       WebElement fruits=wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//select[@id='fruits']"));

            }  });
        System.out.println("Fluent Successfully");
        Select select=new Select(fruits);
        select.selectByVisibleText("Apple");
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println(firstSelectedOption);

    }
}
