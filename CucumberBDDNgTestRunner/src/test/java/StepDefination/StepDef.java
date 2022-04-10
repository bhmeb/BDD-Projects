package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class StepDef {
    public WebDriver webDriver;
    public String landingPageProductName;
    public String offerPageProductName;

    @Given("User is on greenCart Landing page")
    public void user_is_on_green_cart_landing_page() {
        System.setProperty("webdriver.chrome.driver","C://Users//Arpan//Documents//chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://rahulshettyacademy.com/seleniumPractise/#/");
    }
    @When("User searched with short name {string} and Extracted actual name of product")
    public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {

        webDriver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);

        Thread.sleep(2000);

        landingPageProductName = webDriver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
        System.out.println("String extracted from home page" + landingPageProductName);
    }
    @Then("User searched for {string} shortname in offer page")
    public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
        webDriver.findElement(By.linkText("Top Deals")).click();
        Set<String> window = webDriver.getWindowHandles();
        Iterator<String> iterator = window.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        webDriver.switchTo().window(childWindow);
        webDriver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
        Thread.sleep(2000);
        offerPageProductName = webDriver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
        System.out.println("String extracted from offer page" + offerPageProductName);

    }

    @Then("Validate product name in offer page matches with Landing Page")
    public void validateProductNameInOfferPageMatchesWithLandingPage() {
        Assert.assertEquals(offerPageProductName,landingPageProductName);
    }
}
