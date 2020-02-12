package tests;

import AbstractParentTest.AbstractParentTest;
import org.junit.Test;

public class SERPTest extends AbstractParentTest {
    @Test
    public void searchWitAKeyword() {
   serp.openPage();
   serp.clearFields(serp.keyWordField);
   serp.clearFields(serp.regionField);
   serp.inputKeyword();
   serp.submitSearch();
//   Assert.assertTrue();
}}
