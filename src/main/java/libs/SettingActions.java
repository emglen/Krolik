package libs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.List;

public class SettingActions extends ParentPage {
    public SettingActions(WebDriver webDriver) {
        super(webDriver);
    }
    //set default group in admin
    @FindBy(xpath = "//table[1]/tbody/tr/td/button[1]']")
    public WebElement groupID;
  /*  List<WebElement> groupsIDs=webDriver.findElements(groupID);
    public void setDefaultTests(){
        //open admin page
        for(WebElement element:groupsIDs){
            element.click();
        }
    }
*/
}
