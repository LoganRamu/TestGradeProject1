package Learning.POMwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PHPLoginUsingPF {
    public static void main(String[] args) {

        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://www.phptravels.net/login");

        PageFactory.initElements(driver,PHPPageUsingPF.class);

        if(PHPPageUsingPF.cookies.isDisplayed())
        {
            PHPPageUsingPF.cookies.click();
        }

        PHPPageUsingPF.user.sendKeys("user@phptravels.com");
        PHPPageUsingPF.pass.sendKeys("demouser");
        PHPPageUsingPF.button.click();

    }
}
