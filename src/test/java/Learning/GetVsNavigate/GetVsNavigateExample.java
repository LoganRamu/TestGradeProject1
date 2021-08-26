package Learning.GetVsNavigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigateExample
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}

/*get():
1. not store any history
2. get() wait for all elements to available in DOM minimal
naviagte().to()
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
stores history
navigate().to()//no wait
* */
