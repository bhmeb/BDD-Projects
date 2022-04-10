package pageObjects;

import StepDefination.OfferPageStepDef;
import org.openqa.selenium.WebDriver;

public class ObjectManager {

    public LendingPage lendingPage;
    public OfferPage offerPage;
    public WebDriver webDriver;
    public CheckoutPage checkoutPage;

    public ObjectManager(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public LendingPage getLendingPage(){
        lendingPage = new LendingPage(webDriver);
        return lendingPage;
    }

    public OfferPage getOfferPage(){
        offerPage = new OfferPage(webDriver);
        return offerPage;
    }

    public CheckoutPage getCheckoutPage(){
        checkoutPage = new CheckoutPage(webDriver);
        return checkoutPage;
    }

}
