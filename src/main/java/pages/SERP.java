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
    @FindBy (xpath = "//div[@class='text_line-wrap']")
    public WebElement resultTitle;
    @FindBy (xpath = "//p[@id='pResultCount']")
    public WebElement resultCount;

    List<WebElement> keywordTextInVacantionsTitle=webDriver.findElements(By.xpath("//*[@id='h2Position']/b"));
    List<WebElement> autocompleteSuggestion=webDriver.findElements(By.xpath("//div[@class='autocomplete-suggestion']"));


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
    public void autocompeteSuggestionClick(String title){
        for(WebElement element: autocompleteSuggestion){
            String tmp=element.getText();
            if(tmp==title){
                element.click();
                break;
            }
        }
    }
    public void resultVacantionsList(int limitCount, String text){
        int count=0;
        for(WebElement element: keywordTextInVacantionsTitle){
            String tmp=element.getText();
            if(tmp.contains(text)){
                if(count<limitCount){
                    count++;
                }
                else{
                    break;
                }
            }
        }
    }
}
