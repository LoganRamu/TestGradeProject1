package Learning.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebtableNormalMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
        List<WebElement> nameColumn = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        List<WebElement> percentageChangeColumn = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));
        for (int i = 0; i < nameColumn.size(); i++) {
            //System.out.println(nameColumnText.getText());

            if (nameColumn.get(i).getText().equals("Jain Irrigation")) {

                System.out.println(percentageChangeColumn.get(i).getText());

            }
        }

    }

}
