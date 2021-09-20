package Learning.StackOverFlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMytrip
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.makemytrip.com/.");
        driver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']")).clear();
        driver.findElement(By.xpath(".//*[@id='ui-id-1']"));
        driver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(".//*[@class='ui-menu-item'][2]"))));
    }
}
