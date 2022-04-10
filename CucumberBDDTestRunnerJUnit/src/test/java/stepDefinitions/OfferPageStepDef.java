package stepDefinitions;

import org.junit.Assert;
import pageObjects.ObjectManager;
import Utils.TestContextSetup;
import pageObjects.LendingPage;
import io.cucumber.java.en.Then;
import pageObjects.OfferPage;

public class OfferPageStepDef {
    public String offerPageProductName;
    public TestContextSetup context;
    public ObjectManager objectManager;

    //Single Responsibility principal
    //Loosely coupled
    //Factory design

    public OfferPageStepDef(TestContextSetup context){
        this.context = context;
    }

    @Then("^User searched for (.+) shortname in offer page$")
    public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
        SwitchToOfferPage();
        OfferPage offerPage =context.objectManager.getOfferPage();
        offerPage.searchItem(shortname); //context.webDriver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
        Thread.sleep(2000);
        offerPageProductName = offerPage.getProductName(); //offerPageProductName = context.webDriver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();


    }

    public void SwitchToOfferPage(){
        //if switched to offer page -> skip below page
        //if(context.webDriver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")){

        LendingPage lendingPage = context.objectManager.getLendingPage();
        lendingPage.selectTodDealsPage();
        context.genericUtils.SwitchWindowToChild();
    }

    @Then("Validate product name in offer page matches with Landing Page")
    public void validateProductNameInOfferPageMatchesWithLandingPage() {
        Assert.assertEquals(offerPageProductName, context.landingPageProductName);
    }
}
