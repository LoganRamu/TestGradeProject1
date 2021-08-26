package Learning.AlertTestPackage;

import Learning.Utils.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AlertStepDef
{
    WebDriver driver;
    BrowserFactory browserFactory=new BrowserFactory();
    AlertPageObject alertPageObject=new AlertPageObject();
    @Before
  public void setup()
    {
        driver=browserFactory.driverReturn();
    }
    @After
    public void end(Scenario scenario) throws InterruptedException
    {
      if(scenario.isFailed())
      {
        final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png", "FailedScenarios");
      }

    }

    @Given("I Launch URL")
    public void i_launch_url()
    {
      alertPageObject.launchURL(driver);
    }

    @Given("I Test Alert with OK")
    public void i_test_alert_with_ok()
    {
      alertPageObject.alertOk(driver);
    }

    @Given("I Test Alert with OK and Cancel")
    public void i_test_alert_with_ok_and_cancel()
    {

    }

    @Then("I Test Prompt box")
    public void i_test_prompt_box()
    {

    }
    }

