package Learning.AlertTestPackage;
import Learning.RunnerFile.Utill;
import Learning.Utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertPageObject
{
    PropertyReader propertyReader=new PropertyReader();
    String URL=propertyReader.getProperty("alertTestURL");
    Utill utill=new Utill();

    public void launchURL(WebDriver driver)
    {
        driver.get(URL);
    }
    public void alertOk(WebDriver driver)
    {
        WebElement webElement1= driver.findElement(By.linkText("Alert with OK"));
         if (!webElement1.isSelected())
         {
             driver.findElement(By.linkText("Alert with OK")).click();
         }
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

         Alert alert=driver.switchTo().alert();
         String alertMessage1=alert.getText();
        Assert.assertEquals("I am an alert box!",alertMessage1);
        alert.accept();

    }
}
