package AbstractParentTest;


import com.sun.istack.internal.logging.Logger;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.SERP;
import parentPage.ParentPage;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class AbstractParentTest {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    protected MainPage mainPage;
    public SERP serp;
    public ParentPage parentPage;
    ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);

    @Before
    public void setUp(){
        File file = new File("./src/driver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();


        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        parentPage = new ParentPage (webDriver);
        serp = new SERP(webDriver);
        //        mainPage = new MainPage(webDriver);
//        cartPage = new CartPage(webDriver);
        //homePage = new HomePage(webDriver);
        //sparePage = new SparePage(webDriver);
        //editSparePage = new EditSparePage(webDriver);

    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);
    }
}
