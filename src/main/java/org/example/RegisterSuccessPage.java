package org.example;

import org.openqa.selenium.By;

public class RegisterSuccessPage extends Util {
    //Register successfully result
    private By _registrationResult = By.className("result");
    private String expected = "Your registration completed";

    public void verifyUserIsOnRegisterSuccessfullyPage() {
        // Checking User is on register result page
    }
    public void userSeeRegisterSuccessfullyMessage(){
        //getting message of registration completed
    assertTextMessage(getTextFromElement(_registrationResult), expected, "Your registration completed");
    }

}