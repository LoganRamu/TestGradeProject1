package Learning.RunnerFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (

            plugin = { "html:build/reports/cucumber/SauseDemo.html"},
                glue = { "SaucedemoLogin"},
                features = "classpath:SauceDemo.feature"
            )
    public class SauceDemoRunner
    {

    }

