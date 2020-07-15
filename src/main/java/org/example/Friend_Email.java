package org.example;

import org.openqa.selenium.By;

public class Friend_Email extends Util {
    private By _FriendEmail = By.id("FriendEmail");
    private By _Message     = By.id("PersonalMessage");
    private By _SendButton  = By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");



    public void userShouldSentEmail(){
    typetext(_FriendEmail, "jigna1+" + timestamp() + "@gmail.com");
    typetext(_Message, "Suggesting to buy this product");
    clickOnElement(_SendButton);
}

    }

