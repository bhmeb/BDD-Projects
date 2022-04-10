package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Fearures",
        glue = "StepDefination", monochrome = true, dryRun = true
)
public class TestNGRunner extends AbstractTestNGCucumberTests {


}
