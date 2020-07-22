package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util{
  private By _clickOnSearchButton = By.xpath("//input[@class=\"button-1 search-box-button\"]");
  private By _registerButton      = By.className("ico-register");
  private By _welcomeTileText     = By.xpath("//div[@class=\"topic-block-title\"]/h2");
  private By _Books               = By.linkText("Books");
  String expected                 = "Welcome to our store";
  private By _newOnlineStore      = By.linkText("New online store is open!");
  private By _Facebook            = By.linkText("Facebook");
  private By _currencyButton      = By.id("customerCurrency");
  private By _Euro                = By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]");
  String getExpected              = "Euro";

  public void verifyUserIsOnHomepage()

  {
    // verifying if user is on home page
    assertTextMessage(getTextFromElement(_welcomeTileText),expected,"user on home page");

  }
  public void clickOnRegisterButton()
  {
    clickOnElement(_registerButton);// user clicks on register button

  }
  public void clickOnBookCategory()
  {
    clickOnElement(_Books);// user clicks on book category page
  }

  public  void  userShouldClickOnSearchButton()
  //Method for user should click on search button
  {
    clickOnElement(_clickOnSearchButton);

  }
  public void userClickOnNewOnlineStore()
  {
    clickOnElement(_newOnlineStore);
  }
  public void userShouldClickOnFacebook() {
    clickOnElement(_Facebook);
    driver.getWindowHandle();


  }
  public void userShouldClickOnCurrencyButton()
  {
    clickOnElement(_currencyButton);
    clickOnElement(_Euro);

    assertTextMessage(getTextFromElement(_Euro), getExpected, "user don't see euro symbol ");
  }


}



