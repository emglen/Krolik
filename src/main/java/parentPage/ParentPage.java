package parentPage;

import libs.ActionsWithElements;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ParentPage {
    protected WebDriver webDriver;
    protected ActionsWithElements actionsWithElements;
    public ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class); //создание всех переменных из класса
    String prod_Url;
    String stage_Url;


    public ParentPage(WebDriver webDriver, String partUrl) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//input[@id='tbKeywords']")
    protected WebElement keyWordField;
    @FindBy(xpath = "//input[@id='tbRegion']")
    protected WebElement regionField;
    @FindBy (xpath = "//input[@id='lbSearch']")
    private WebElement submitSearchButton;
}
