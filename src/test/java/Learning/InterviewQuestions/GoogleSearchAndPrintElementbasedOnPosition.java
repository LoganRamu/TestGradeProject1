package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchAndPrintElementbasedOnPosition {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("lionel messi");

        List<WebElement> allName=driver.findElements(By.xpath("//ul[@role='listbox']//li"));

       // int a=0;
        for (WebElement suggestionList:allName)
        {
            String  txt1=suggestionList.getText();
            System.out.println(txt1);
           // a++;
            //Below is code for position
            /*if(a==3)
            {
                suggestionList.click();
                break;
            }*/
            if(txt1.contains("salary"))
            {
                suggestionList.click();
                break;
            }

        }
    }
}
