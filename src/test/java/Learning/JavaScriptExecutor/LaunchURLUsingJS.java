package Learning.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//f12->console->Eye icon->window.location='https://www.google.com/'

public class LaunchURLUsingJS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com/'");

    }
}
