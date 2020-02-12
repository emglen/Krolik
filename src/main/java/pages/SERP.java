package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SERP extends ParentPage {
    public SERP(WebDriver webDriver, String partUrl) {
        super(webDriver, partUrl);
    }

    public void openPage() {
        try {
            webDriver.get("http://v3.test.itpmgroup.com/");
        } catch (Exception e) {
            Assert.fail("Can not work with browser");
        }

    }}
