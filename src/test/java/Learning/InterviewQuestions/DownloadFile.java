package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class DownloadFile {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='http://www.leafground.com/pages/download.html'");

        /*List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='todo']/a"));

        for (WebElement allLinksAction:allLinks) {
            allLinksAction.click();*/

        driver.findElement(By.linkText("Download Excel")).click();
        Thread.sleep(3000);

        File file = new File("C:\\Users\\Admin\\Downloads");
        File[] allFiles = file.listFiles();

        for (File allFileNames : allFiles) {
            if (allFileNames.getName().contains("testleaf")) {
                System.out.println("File downloaded successfully");
                break;

            }
        }
    }
}
