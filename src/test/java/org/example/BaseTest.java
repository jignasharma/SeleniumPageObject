package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util{
    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod
    public void openBrowser() {
        browserManager.setBrowser();// calling browser method to open home page
    }

    @AfterMethod
    public void closeBrowser() {
        browserManager.setCloseBrowser();// calling browser method to close the browser
    }

    public  void closeBrowser(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            takeScreenShot(result.getName()+timestamp());

        }
        browserManager.setCloseBrowser();// calling browser method to close the browser
    }
}