package Learning.MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandlesLearningAdvance
{
    public static void main(String args[])
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        String mainWindow=driver.getWindowHandle();
        System.out.println(mainWindow);
        WebElement bt1=driver.findElement(By.xpath("//button[@id='tabButton']"));
        bt1.click();
        Set<String> winhandels=driver.getWindowHandles();
        System.out.println(winhandels);
        Iterator<String> it= winhandels.iterator();
        //Check whether the child window available, if yes switch to
        while(it.hasNext())
        {
            String childWindow=it.next();
            //System.out.println(childWindow);
            if(!mainWindow.equalsIgnoreCase(childWindow))
            {
                driver.switchTo().window(childWindow);
                WebElement text=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
                String str1=text.getText();
                System.out.println(str1);
            }
            //switch to main window
            driver.switchTo().window(mainWindow);
            String title1=driver.getTitle();
            System.out.println(title1);
        }
    }
}
