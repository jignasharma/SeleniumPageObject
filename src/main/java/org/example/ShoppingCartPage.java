package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Util{
    private By _getTextShoppingCart = By.xpath("//h1[text()=\"Shopping cart\"]");
   String expectedTileText = "Shopping cart";

    public void verifyUserIsOnShoppingCartPage()
    {

  assertTextMessage(getTextFromElement(_getTextShoppingCart),expectedTileText,"user is not on shopping cart page");

        assertURL("cart");// to verify if user is on shopping cart page

    }


}
