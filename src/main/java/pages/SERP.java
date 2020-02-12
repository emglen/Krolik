package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SERP extends ParentPage {
    public SERP(WebDriver webDriver, String partUrl) {
        super(webDriver);
    }
    @FindBy(xpath = "//input[@id='tbKeywords']")
    public WebElement keyWordField;
    @FindBy(xpath = "//input[@id='tbRegion']")
    public WebElement regionField;
    @FindBy (xpath = "//input[@id='lbSearch']")
    public WebElement submitSearchButton;

    public void openPage() {
        try {
            webDriver.get(configProperties.prod_url());
        } catch (Exception e) {
            Assert.fail("Can not work with browser");
        }

    }

    public void clearFields(WebElement element) {
        actionsWithElements.clearFields();
    }

    public void inputKeyword() {
        actionsWithElements.typeText("QA");
    }

    public void submitSearch() {
        actionsWithElements.clickElement(submitSearchButton);
    }
}
