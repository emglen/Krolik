package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class MainPage extends ParentPage {
    public MainPage(WebDriver webDriver, String partUrl) {
        super(webDriver, partUrl);
    }
    @FindBy (xpath = "//input[@id='tbKeywords']")
    private WebElement keyWordField;

}
