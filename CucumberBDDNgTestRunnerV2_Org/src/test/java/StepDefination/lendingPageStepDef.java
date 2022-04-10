package StepDefination;

import Utils.TestContextSetup;
import pageObjects.LendingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class lendingPageStepDef {

    public TestContextSetup context;
    public LendingPage lendingPage;
    public String landingPageProductName;

    public lendingPageStepDef(TestContextSetup context){
        this.context = context;
        this.lendingPage = context.objectManager.getLendingPage();
    }

    @Given("User is on greenCart Landing page")
    public void user_is_on_green_cart_landing_page() {
        Assert.assertTrue(lendingPage.getTitleLendingPage().contains("GreenKart"));

        //context.objectManager.getLendingPage();
       /* System.setProperty("webdriver.chrome.driver", "C://Users//Arpan//Documents//");
        context.webDriver = new ChromeDriver();
        context.webDriver.get("http://rahulshettyacademy.com/seleniumPractise/#/");*/
    }

    //Make dynamic string by using ^ and $
    @When("^User searched with short name (.+) and Extracted actual name of product$")
    public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {

        lendingPage.searchItem(shortname);
        Thread.sleep(2000);

        context.landingPageProductName = lendingPage.getProductName().split("-")[0].trim();
        System.out.println(landingPageProductName + " is extracted from Home page");
    }

    @And("Added {string} items of the selected product to cart")
    public void addedItemsOfTheSelectedProductToCart(String quantity) {
        lendingPage.incrementQuantity(Integer.parseInt(quantity));
        lendingPage.addToCart();
    }
}
