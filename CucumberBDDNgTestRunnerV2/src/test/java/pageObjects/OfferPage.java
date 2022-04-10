package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

    public WebDriver webDriver;

    public OfferPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("tr td:nth-child(1)");


    public void searchItem(String name){
        webDriver.findElement(search).sendKeys(name);
    }
    public void getSearchText()
    {
        webDriver.findElement(search).getText();
    }
    public String getProductName(){
        return webDriver.findElement(productName).getText();
    }

}
