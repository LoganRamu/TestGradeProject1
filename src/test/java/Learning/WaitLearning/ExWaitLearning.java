package Learning.WaitLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExWaitLearning {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement selectTest=driver.findElement(By.xpath("//footer[@class='card-footer']//following::a[contains(text(),'Drop-Down')]"));
        wait.until(ExpectedConditions.visibilityOf(selectTest));
        selectTest.click();
    }
}

/*methods:
1. visibilityOf
2.elementTobeClickable
3. elementToBeSelect
4.presenceOfElementLocated
5. textToBePresentInElement
6.alertIsPresent
* */