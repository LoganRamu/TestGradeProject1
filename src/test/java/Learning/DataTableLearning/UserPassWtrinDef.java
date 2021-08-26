package Learning.DataTableLearning;

import Learning.POMLearning.PHPLoginPage;
import Learning.Utils.BrowserSetup;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class UserPassWtrinDef {
    WebDriver driver;
    BrowserSetup browserSetup=new BrowserSetup();
    PHPLoginPage phpLoginPage=new PHPLoginPage();
    @Before
    public void setup()
    {
       driver= browserSetup.chrome();
    }

    @When("URL to be launched")
    public void url_to_be_launched() {
        driver.get("https://www.phptravels.net/login");
    }

    @Given("Username {string} and password {string}")
    public void username_and_password(String user, String pass) {
        if(PHPLoginPage.acceptAllCookies(driver).isDisplayed())
        {
            PHPLoginPage.acceptAllCookies(driver).click();
        }
        PHPLoginPage.user(driver).sendKeys(user);
        PHPLoginPage.pass(driver).sendKeys(pass);
        PHPLoginPage.clickLogin(driver).click();
    }
    @Then("User logged in")
    public void user_logged_in() {

    }
}
