package Utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GenericUtils {

    public WebDriver webDriver;
    public GenericUtils(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    
    public void SwitchWindowToChild(){
        Set<String> window = webDriver.getWindowHandles();
        Iterator<String> iterator = window.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        webDriver.switchTo().window(childWindow);
    }
}
