package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastElementFromWebtable
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
        int totalRows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();

        String lastRowValue=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+totalRows+"]")).getText();
        System.out.println(lastRowValue);
        String lastColumnValue=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+totalRows+"]/td[5]")).getText();
        System.out.println(lastRowValue);

    }
}
