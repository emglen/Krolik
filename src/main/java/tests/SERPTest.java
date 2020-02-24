package tests;

import AbstractParentTest.AbstractParentTest;
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
//   Assert.assertTrue();
}}
