package org.example;

import org.openqa.selenium.By;

public class RegisterSuccessPage extends Util {

    //Register successfully result


    private By _registerSuccessfulMessage = By.xpath("\"//div[@class=\"result\"]");
    String expectedRegisterSuccessfulMessage = "Your registration completed";

    public void verifyUserIsOnRegisterResultPage()
    {
        assertURL("registerresult");// checking if is pn register result page

    }
    public void userCanSeeSuccessfulMessage()
    {
        // getting  Your registration completed message
        assertTextMessage(getTextFromElement(_registerSuccessfulMessage),expectedRegisterSuccessfulMessage,"user can see successfull message");
        System.out.println(_registerSuccessfulMessage);



    }
}