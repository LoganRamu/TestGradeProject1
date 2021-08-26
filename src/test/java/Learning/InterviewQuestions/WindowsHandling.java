package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Window.html");

        String parentWindow = driver.getWindowHandle();
        WebElement btn1 = driver.findElement(By.id("home"));
        btn1.click();

        Set<String> allWindows = driver.getWindowHandles();

        Iterator<String> iterator = allWindows.iterator();

        while (iterator.hasNext()) {
            String childwindows = iterator.next();

            if (!childwindows.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(childwindows);
            }
        }
        driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
        driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(parentWindow); // driver.switchTo().defaultContent() will work if the current wibdow not closed
        String headerText = driver.findElement(By.xpath("//h1[contains(text(),'Work')]")).getText();
        System.out.println(headerText);

        WebElement btn2 = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
        btn2.click();

        Set<String> allWindows1 = driver.getWindowHandles();
        System.out.println(allWindows1.size());

        Iterator<String> iterator1 = allWindows1.iterator();

        while (iterator1.hasNext()) {
            String childWins1 = iterator1.next();

            if (!childWins1.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(childWins1);
                driver.close();
            }
        }
        System.out.println("All child windows closed");


    }


}
