package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NeedForImWaitAndExWait
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("");
        //Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait(driver,20);

        WebElement ele1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(""))));



    }
}


/*Thread.sleep(5000);

Wait for 5 seconds eventhough the element is present in 2 secs

Implicit wait:
Pros: driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
if the element found in 1st sec, go for next step in code
is wait untill element preset in DOM, not wait for interact
Only check whether the element present in DOM
Static, no condition

* */