package parentPage;

import libs.ActionsWithElements;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;


public class ParentPage {
    protected WebDriver webDriver;
    protected ActionsWithElements actionsWithElements;
    public ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class); //создание всех переменных из класса
    String prod_Url;
    String stage_Url;


    public ParentPage(WebDriver webDriver, String partUrl) {
        this.webDriver = webDriver;

}}
