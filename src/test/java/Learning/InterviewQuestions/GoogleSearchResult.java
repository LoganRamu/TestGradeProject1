package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchResult
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("lional messi");
        List<WebElement> searchItems=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        for (WebElement suggestionText: searchItems) {
            System.out.println(suggestionText.getText());

        }
    }
}
