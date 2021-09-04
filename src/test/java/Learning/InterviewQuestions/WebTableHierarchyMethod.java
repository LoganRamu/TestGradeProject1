package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableHierarchyMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/table");
        WebElement table = driver.findElement(By.id("simpletable"));
        List<WebElement> headers = table.findElements(By.tagName("th"));

        headers.forEach(i -> System.out.println(i.getText()));
        //headers.forEach(System.out::println);
        /*for (WebElement headterTest : headers) {
            System.out.println(headterTest.getText());
        }*/

        List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
        for (WebElement allRowTest:allRows) {
            List<WebElement> tData = allRowTest.findElements(By.tagName("td"));
            WebElement firstRow = tData.get(0);
            System.out.println(firstRow.getText());
        }

        for (WebElement getLastName:allRows) {
            List<WebElement> tData1 = getLastName.findElements(By.tagName("td"));
            WebElement allLastNames = tData1.get(1);
            if(allLastNames.getText().equals("Raj") || allLastNames.getText().equals("Man"))
            {
                System.out.println(tData1.get(2).getText());
                tData1.get(3).findElement(By.tagName("input")).click();
            }

        }


    }
}
