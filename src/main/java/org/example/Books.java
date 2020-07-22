package org.example;

import org.openqa.selenium.By;

public class Books extends Util {
    private By _AddToCartBook1 = By.xpath("//div[@class=\"product-grid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _AddToCartBook2 = By.xpath("//div[@class=\"product-grid\"]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _ShoppingCart = By.xpath("//span[@class=\"cart-label\"]");

    public void verifyUserOnBookPage(){

        assertURL("books"); // to check if the user is on book page
    }
    public void userClickOnFirstBookToAddToCart()
    {
        clickOnElement(_AddToCartBook1);// user clicks on on of the products and add it to shopping cart
    }
    public void userClickOnSecondBookToAddToCart()
    {
        clickOnElement(_AddToCartBook2);//user clicks on on of the products and add it to shopping cart

    }
    public void userClickOnShoppingCart()
    {
        clickOnElement(_ShoppingCart);// user click on shopping cart to check which items are been saved
    }
    }
