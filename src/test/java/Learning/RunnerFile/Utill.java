package Learning.RunnerFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utill
{
    WebDriver driver;
    public void imWait()
    {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void exWait()
    {
        WebDriverWait wait=new WebDriverWait(driver,20);
     //wait.until(ExpectedConditions.visibilityOf(By by));
    }
}
