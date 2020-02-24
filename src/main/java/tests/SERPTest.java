package tests;

import AbstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class SERPTest extends AbstractParentTest {
    @Test
    public void searchWithKeyword() {
        serp.openPage();
        serp.keyWordField.clear();
        serp.regionField.clear();
        serp.keyWordField.sendKeys("QA");
        serp.submitSearchButton.click();
        serp.crazyPopupNoButton.click();
        serp.titleContainsKeyword(serp.keyWordField.getText());
        serp.resultVacantionsList(7, "QA");
        String titleResultText=serp.resultTitle.getText();
        Assert.assertTrue(titleResultText.contains(serp.keyWordField.getText()));
        Assert.assertTrue(serp.resultCount.isDisplayed());
    }
    @Test
    public void searchWithRegion(){
        serp.openPage();
        serp.keyWordField.clear();
        serp.regionField.clear();
        serp.regionField.sendKeys("Киев");
        serp.submitSearchButton.click();
        serp.crazyPopupNoButton.click();
        String titleResultText=serp.resultTitle.getText();
        Assert.assertTrue(titleResultText.contains(serp.regionField.getText()));
        Assert.assertTrue(serp.resultCount.isDisplayed());
    }
}
