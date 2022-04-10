package StepDefination;

import Utils.TestContextSetup;
import pageObjects.CheckoutPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckoutStepDef {

    public TestContextSetup context;
    public CheckoutPage checkoutPage;

    public CheckoutStepDef(TestContextSetup context){

        this.context = context;
        this.checkoutPage = context.objectManager.getCheckoutPage();
    }

    @Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
    public void userProceedsToCheckoutAndValidateTheNameItemsInCheckoutPage(String name) throws InterruptedException {
        checkoutPage.CheckOutItem();
        //Thread.sleep(2000);
    }

    @Then("verify user has ability to enter promo code and place the order")
    public void verifyUserHasAbilityToEnterPromoCodeAndPlaceTheOrder() {

        Assert.assertTrue(checkoutPage.VerifyPromoBtn());
        Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
    }
}
