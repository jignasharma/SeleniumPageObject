package org.example;

import org.openqa.selenium.By;

public class DigitalStorm_Page extends Util {

    private By _emailFriend  = By.xpath("//input[@value=\"Email a friend\"]");
    private By _digitalStormTitle = By.xpath("//div[@class=\"overview\"]/div[1]/h1");
    String expected = "Digital Storm VANQUISH 3 Custom Performance PC";

    public void verifyUserIsOnDigitalStormPage(){
        //To verify user is on Digital Storm page
        assertTextMessage(getTextFromElement(_digitalStormTitle),expected,"user is on Digital Storm VANQUISH 3 Custom Performance PC");
        System.out.println(_digitalStormTitle);
    }


    public void userShouldBeOnDigitalStormPage(){

        clickOnElement(_emailFriend);

    }

}