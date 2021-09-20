package Learning.StackOverFlowTest;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFromASpanTextInBreak
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file://C://Users//Admin//Desktop//StackOver1.html");
        /*String value=driver.findElement(By.tagName("h3")).getText();
        System.out.println(value);
        String[] s1=value.split(":");
        System.out.println(s1[1].trim());*/
       /* WebElement e = driver.findElement(By.xpath("//span[contains(text(),'Vetting Price')]"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement element = (WebElement) js.executeScript("return arguments[0].childNodes[1];", e);
        //WebElement el = (WebElement)((JavascriptExecutor)driver).executeScript("return arguments[0].childNodes[1];", e);
        String value=element.getAttribute("innerText");
        System.out.println(value);*/
        String value=driver.findElement(By.tagName("h3")).getText();
        String s1=value.split(":")[1].trim();
        System.out.println(s1);

        WebElement e = driver.findElement(By.xpath("//h3[contains(@class,'paragraph text-center')]"));
        String el = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].textContent;", e);
        String s  = el.split("\\ ")[2].trim();
        System.out.println(s);

    }
}
