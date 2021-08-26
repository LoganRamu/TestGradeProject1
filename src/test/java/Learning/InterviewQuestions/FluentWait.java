package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

public class FluentWait
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("");
        Wait<WebDriver> wait=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver);

        WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(""));
            }
        });

    }
}
