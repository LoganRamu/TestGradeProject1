package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class LastElementFromWebtable {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
        int totalRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();

        String lastRowValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + totalRows + "]")).getText();
        System.out.println(lastRowValue);
        String lastColumnValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + totalRows + "]/td[5]")).getText();
        System.out.println(lastRowValue);
    }
}
