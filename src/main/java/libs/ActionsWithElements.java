package libs;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithElements {
    WebDriver webDriver;
    WebDriverWait webDriverWait_10, webDriverWait_15 ;
    ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);

    public ActionsWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait_10 = new WebDriverWait(webDriver, configProperties.TIME_FOR_EXPLICIT_WAIT_LOW());
        webDriverWait_15 = new WebDriverWait(webDriver, 15);
    }

    public void typeText(WebElement webElement,String text){
       webElement.sendKeys(text);
    }
    public void clickElement(WebElement webElement){
        webElement.click();
    }
    public void clearFields(WebElement webElement) {
        webElement.clear();
    }
}

