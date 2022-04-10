package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    public WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver=driver;
    }

    By cardBag = By.cssSelector("[alt='Cart']");
    By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
    By promoBtn = By.cssSelector(".promoCode");
    By placeOrderBtn = By.xpath("//button[contains(text),'Place Order')]");

    public void CheckOutItem(){
        driver.findElement(cardBag).click();
        driver.findElement(checkOutButton).click();
    }

    public Boolean VerifyPromoBtn(){
       return driver.findElement(promoBtn).isDisplayed();
    }

    public Boolean VerifyPlaceOrder(){
        return driver.findElement(placeOrderBtn).isDisplayed();
    }
}
