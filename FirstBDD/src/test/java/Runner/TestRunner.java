package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/FeatureFile",
        dryRun = true, monochrome = true,
        //glue="stepDefinations", stepNotifications = true, tags = "@RegTest or @RegTest")
        //glue="stepDefinations", stepNotifications = true, tags = "@SanityTest")
        //glue="stepDefinations", stepNotifications = true, tags = "not @SanityTest")
        //glue="stepDefinations", stepNotifications = true, tags = "@RegTest and @RegTest")
        //glue="stepDefinations", stepNotifications = true, tags = "@RegTest,@RegTest")
        glue="stepDefinations",
        stepNotifications = true, tags = "@MobileTest or @WebTest",
        plugin={"pretty", "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml"}) //pretty use for color report and For html/json report generation


public class TestRunner {
}

//Cucumber not run itself
//It can be run by JUnit Test Runner/TestNG Test Runner/java

//JUnit runner(default recommendation) vs TestNg runner
//JUnit we use @RunWith annotation to trigger our feature file
//TestNg use extend AbstractTestNGCucumberTests to trigger our feature file


