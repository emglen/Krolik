package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.List;

public class MainPage extends ParentPage {
    public MainPage(WebDriver webDriver, String partUrl) {
        super(webDriver);
    }
    @FindBy(xpath = "//input[@id='tbKeywords']")
    protected WebElement keyWordField;
    @FindBy(xpath = "//input[@id='tbRegion']")
    protected WebElement regionField;
    @FindBy (xpath = "//input[@id='lbSearch']")
    private WebElement submitSearchButton;

    List<WebElement> autocompleteSuggestion=webDriver.findElements(By.xpath("//div[@class='autocomplete-suggestion']"));

    public void autocompeteSuggestionClick(String title){
        for(WebElement element: autocompleteSuggestion){
            String tmp=element.getText();
            if(tmp==title){
                element.click();
                break;
            }
        }
    }
}
