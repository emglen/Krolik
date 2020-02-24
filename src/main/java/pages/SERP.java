package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.List;
import java.util.Properties;

public class SERP extends ParentPage {
    public SERP(WebDriver webDriver, String partUrl) {
        super(webDriver);
    }
    public SERP(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//input[@id='tbKeywords']")
    public WebElement keyWordField;
    @FindBy(xpath = "//input[@id='tbRegion']")
    public WebElement regionField;
    @FindBy (xpath = "//input[@id='lbSearch']")
    public WebElement submitSearchButton;
    @FindBy (xpath = "//span[@class='button agree_button colored_button agree_button-js']")
    public WebElement crazyPopupYesButton;
    @FindBy (xpath = "//span[@class='button disagree_button disagree_button-js']")
    public WebElement crazyPopupNoButton;
    List<WebElement> keywordTextInVacantionsTitle=webDriver.findElements(By.xpath("//*[@id='h2Position']/b"));


    public void openPage() {
        try {
            webDriver.get(configProperties.prod_url());
        } catch (Exception e) {
            Assert.fail("Can not work with browser");
        }
    }

    public void titleContainsKeyword(String title){
        for(WebElement element: keywordTextInVacantionsTitle){
            String tmp=element.getText();
            Assert.assertEquals(tmp,tmp.contains(title));
        }
    }
}
