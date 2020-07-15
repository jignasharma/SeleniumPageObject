package org.example;

import org.openqa.selenium.By;

public class DesktopPage extends Util {
    private By _clickDigitalStorm = By.xpath("//h2/a[text()=\"Digital Storm VANQUISH 3 Custom Performance PC\"]");
    private By _desktopTitle      = By.xpath("//div[@class=\"page category-page\"]/div[1]/h1");
    String expected = "Desktops";

    public void verifyUserIsOnComputerPage(){
        //To verify user is on Computer page
        assertTextMessage(getTextFromElement(_desktopTitle),expected,"user is on Desktops page");
        System.out.println(_desktopTitle);
    }

    public void userClickOnDigitalStorm() {

        clickOnElement(_clickDigitalStorm);
    }
}