package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features="src/test/java/FeatureFile",
        glue="stepDefinations")
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
}

//JUnit runner vs TestNg runner
//JUnit we use @RunWith annotation to trigger our feature file
//TestNg use extend AbstractTestNGCucumberTests to trigger our feature file


