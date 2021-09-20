package Learning.PermissionPop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class HandlePopup
{
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();

        Map<String,Integer> contentSetting=new HashMap<String, Integer>();
        Map<String,Object> profile=new HashMap<String,Object>();
        Map<String,Object>prefs=new HashMap<String,Object>();

        contentSetting.put("notifications",1);
        profile.put("managed_default_content_settings",contentSetting);
        prefs.put("profile",profile);

        options.setExperimentalOption("prefs",prefs);

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();





    }
}
