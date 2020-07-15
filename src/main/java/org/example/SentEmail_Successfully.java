package org.example;

import org.openqa.selenium.By;

public class SentEmail_Successfully extends Util {
    //Result of Email sent successfully
    private By _emailResult = By.className("result"); // Locator for email has been sent
    private String expected = "Your message has been sent";

    public void userShouldGetMessage() {
        // Comparing the expected and actual message
        assertTextMessage(getTextFromElement(_emailResult), expected, "Your message has been sent");

    }
}