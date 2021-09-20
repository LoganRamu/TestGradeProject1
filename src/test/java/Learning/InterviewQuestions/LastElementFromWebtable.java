package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class LastElementFromWebtable {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
        int totalRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();

        List<WebElement> listCompany=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        List<WebElement> listChange=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr//td[5]"));

        String changeText="";

        for(int i=0;i<listChange.size();i++)
        {
            if(listCompany.get(i).getText().equals("Future Consumer"))
            {
                System.out.println(listChange.get(i).getText());

            }
        }



        String lastRowValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + totalRows + "]")).getText();
        System.out.println(lastRowValue);
        String lastColumnValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + totalRows + "]/td[5]")).getText();
        System.out.println(lastColumnValue);
    }
}
