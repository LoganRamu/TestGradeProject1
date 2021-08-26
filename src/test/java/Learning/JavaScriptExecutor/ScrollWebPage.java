package Learning.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //Scroll down
        js.executeScript("window.scroll(0, 500)","");
        Thread.sleep(3000);
        //scroll up
        js.executeScript("window.scroll(0, -500)","");
        Thread.sleep(3000);
        //Scroll to bottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
        //Scroll to top
        js.executeScript("window.scroll(0,0)","");
        Thread.sleep(3000);
        //scroll to particular element
        WebElement ele1=driver.findElement(By.xpath(""));
        js.executeScript("arguments[0].scrollIntoView(true)",ele1);

    }
}
