package tests;

import AbstractParentTest.AbstractParentTest;
import org.junit.Test;

public class SERPTest extends AbstractParentTest {
    @Test
    public void searchWithKeyword() {
        serp.openPage();
        serp.clearFields(serp.keyWordField);
        serp.clearFields(serp.regionField);
        serp.inputKeyword();
        serp.submitSearch();
        serp.crazyPopupNoButton.click();
//   Assert.assertTrue();
}}
