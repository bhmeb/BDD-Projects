package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LendingPage {

    public WebDriver webDriver;

    public LendingPage(WebDriver webDriver){
        this.webDriver=webDriver;

    }

    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");
    By todDeals = By.linkText("Top Deals");
    By increment = By.cssSelector("a.increment");
    By addCart = By.cssSelector(".product-action button");

    public void searchItem(String name){
        webDriver.findElement(search).sendKeys(name);
    }

    public void getSearchText(String name){
        webDriver.findElement(search).getText();
    }

    public void incrementQuantity(int quantity) {
        int i = quantity-1;
        while (i > 0) {
            webDriver.findElement(increment).click();
            i--;
        }
    }

    public void addToCart(){
        webDriver.findElement(addCart).click();
    }

    public String getProductName(){
        return webDriver.findElement(productName).getText();
    }

    public void selectTodDealsPage(){
        webDriver.findElement(todDeals).click();
    }

    public String getTitleLendingPage(){
        return webDriver.getTitle();

    }
}
