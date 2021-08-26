package Learning.MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class WebTableLearning
{
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://letcode.in/table");
        driver.manage().window().maximize();
        WebElement table=driver.findElement(By.id("simpletable"));
        //List<WebElement> headers =driver.findElements(By.xpath("//table[@id='simpletable']/thead"));
        List<WebElement> headers=table.findElements(By.tagName("thead"));
        for (WebElement he:headers)
        {
            System.out.println(he.getText());
        }
        //List<WebElement> allFiestnames=table.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[1]"));
        List<WebElement> allFiestnames1=table.findElements(By.cssSelector("tbody tr"));
        for (WebElement rows:allFiestnames1)
        {

            List<WebElement> colums=rows.findElements(By.tagName("td"));
            WebElement firstColum=colums.get(0);
            System.out.println(firstColum.getText());


            //System.out.println(na.getText());
        }
        //List<WebElement> allFiestnames1=table.findElements(By.cssSelector("tbody tr"));
        for (WebElement rowss:allFiestnames1) {
            List<WebElement> allColumn = rowss.findElements(By.tagName("td"));

            WebElement secondColum = allColumn.get(1);
            /*String lName=secondColum.getText();
            System.out.println(lName);*/
            if (secondColum.getText().equals("Raj")) {
                allColumn.get(3).findElement(By.tagName("input")).click();

            }
        }
        /*for(int i=0;i<allFiestnames1.size();i++)
        {
            List<WebElement> allFiestnames1=LallFiestnames1.get(i).findElements(By.tagName("td"));

*/
        //List<WebElement> headers =driver.findElements(By.xpath("//table[@id='simpletable']/thead"));
//driver.close();
    }

}
