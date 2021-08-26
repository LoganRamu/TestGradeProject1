package Learning.RunnerFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:build/reports/cucumber/alertDemo.html"},
        glue = {"DataTableLearning"},
        features = "FeatureWithStringUserPass.feature",
        dryRun=true,
        monochrome = true

)
public class AlertTestRunner {
}
