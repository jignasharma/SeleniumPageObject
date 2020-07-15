package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util{
  //Homepage Locator
  private By _registrationButton = By.className("ico-register");
  private By _homePageTitle      = By.xpath("//div[@class=\"topic-block-title\"]/h2");//user is on homepage
  private By _Books              = By.linkText("Books");
  private String expected        = "Welcome to our store";

  public void verifyUserIsOnHomepage() {

    assertTextMessage(getTextFromElement(_homePageTitle), expected, "User is on Homepage");

  }//Comparing the expected and actual text message


public void clickOnRegisterButton()
{
  clickOnElement(_registrationButton);

}
public void verifyUserIsOnBookPage(){ assertURL("Books");
    //To verify user is on books page

}



}
