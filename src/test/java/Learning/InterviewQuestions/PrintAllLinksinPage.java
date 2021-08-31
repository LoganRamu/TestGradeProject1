package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllLinksinPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("messi \n");

        //below code is for pint total no of anchor tags in a page
        /*int a=driver.findElements(By.tagName("a")).size();
        System.out.println(a);*/
        List<WebElement> anchorTags = driver.findElements(By.tagName("a"));

        for (WebElement allTags : anchorTags) {
            String urls = allTags.getAttribute("href");
            if (urls != null) {
                System.out.println(urls);
            }
        }
        System.out.println("Below are the proper URL");
        List<WebElement> properLinks = driver.findElements(By.xpath("//h3/following::cite"));
        for (WebElement properUrls : properLinks) {
            System.out.println(properUrls.getText());

        }


    }

}


