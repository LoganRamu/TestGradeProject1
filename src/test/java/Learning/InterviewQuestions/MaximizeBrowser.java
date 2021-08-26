package Learning.InterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MaximizeBrowser {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        //Approach 1
        driver.manage().window().maximize();

        //2
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ChromeOptions options=new ChromeOptions();
        options.merge(dc);
        options.addArguments("--start-maximized");
    }
}
