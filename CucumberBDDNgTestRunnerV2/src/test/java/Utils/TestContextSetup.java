package Utils;

import org.openqa.selenium.WebDriver;
import pageObjects.ObjectManager;
import java.io.IOException;

public class TestContextSetup {

    public WebDriver driver;
    public String landingPageProductName;
    public ObjectManager objectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TestContextSetup() throws IOException {
        testBase = new TestBase();
        objectManager = new ObjectManager(testBase.WebDriverManager());
        genericUtils = new GenericUtils(testBase.WebDriverManager());
    }

}
