package parentPage;

import libs.ActionsWithElements;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ParentPage{
    protected WebDriver webDriver;
    protected ActionsWithElements actionsWithElements;
    protected ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class); //создание всех переменных из класса
    String prod_Url;
    String stage_Url;

    public ParentPage(WebDriver webDriver, String partUrl) {
        this.webDriver = webDriver;
        prod_Url = configProperties.prod_url(); //вытягивам переменную из файлика
        PageFactory.initElements(webDriver, this);
        actionsWithElements = new ActionsWithElements(webDriver);
    }

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        prod_Url = configProperties.prod_url(); //вытягивам переменную из файлика
        PageFactory.initElements(webDriver, this);
        actionsWithElements = new ActionsWithElements(webDriver);
    }
}
