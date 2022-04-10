package cucumber.automation.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/FeatureFile",
        glue="src/test/java/cucumber/automation/StepDef/StepDefination.java")
public class APIRunner {


}
