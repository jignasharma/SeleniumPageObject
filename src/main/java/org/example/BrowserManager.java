package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util
{
    public static void setBrowser()
    {
        // set browser method to help reuse it
        System.setProperty("webdriver.chrome.driver","src\\test\\BrowserDrivers\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://demo.nopcommerce.com");
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

    }
    public  static  void setCloseBrowser()
    {
        // close the browser once the test been run as it wont open many tabs
        driver.close();

    }



}
