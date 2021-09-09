package Learning.JavaScriptExecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class SimpleExample
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/web/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement email=driver.findElement(By.id("email"));
        js.executeScript("arguments[0].value='logangru.com'",email);
        //js.executeScript("arguments[0].value=arguments[1]",email, 'logangru.com');
        //js.executeScript("document.getElementsByName('pass')[0].value='pass'","");
        js.executeScript("document.getElementsByName('pass')[0].value='pass'");
        Thread.sleep(3000);
        driver.quit();

    }
}
