package org.example;

import org.openqa.selenium.By;
public class Computer_Page extends Util {
    // user on computer product page
       private By _clickDesktop = By.xpath("//ul[@class=\"sublist\"]/li[1]/a");
       private By _computerTitle = By.xpath("//h1[text()=\"Computers\"]");
       String expected = "Computers";

       public void verifyUserIsOnComputerPage(){
           //To verify user is on Computer page
           assertTextMessage(getTextFromElement(_computerTitle),expected,"user is on computer page");
           System.out.println(_computerTitle);
       }


        public void usserShouldClickOnDesktop() {
            //User should email a friend successfully
            clickOnElement(_clickDesktop);


        }
        }
