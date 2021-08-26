package Learning.SaucedemoLogin;

import Learning.Utils.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SauseDemoStepDef
{
    WebDriver driver;
    SauceDemoObjFile sauobj=new SauceDemoObjFile();
    BrowserFactory browserFactory=new BrowserFactory();

    @Before
    public void setup()
    {
        driver=browserFactory.driverReturn();
        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();*/
    }
    @After
    public void end(Scenario scenario)
            throws InterruptedException {
        driver.wait(1000);
        driver.quit();
        if (scenario.isFailed())
        {
            final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "FailedScenarios");
        }


    }
    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() throws Throwable
    {
        sauobj.launchURL(driver);
    }

    @Given("I enter the username and password")
    public void i_enter_the_username_and_password() throws Throwable
    {
        sauobj.credentials(driver);
    }

    @Given("I Click on login button")
    public void i_click_on_login_button() throws Throwable
    {
        sauobj.submitButton(driver);
    }

    @Then("I should see the product page")
    public void i_should_see_the_product_page() throws Throwable
    {
    sauobj.productPage(driver);
    }
}
