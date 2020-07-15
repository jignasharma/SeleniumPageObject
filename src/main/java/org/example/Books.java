package org.example;

import org.openqa.selenium.By;

public class Books extends Util {
    private By _AddToCartBook1 = By.xpath("//div[@class=\"product-grid\"]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _AddToCartBook2 = By.xpath("//div[@class=\"product-grid\"]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _ShoppingCart = By.xpath("//span[@class=\"cart-label\"]");

    public void verifyUserOnBookPage()
    { assertURL("books");//To check that user is on book page}
        public void userClicskOnFirstBookToAddToCart()
        {
            clickOnElement(_AddToCartBook1);// User clicks on the product to add to cart
        }
public void userClicksOnSecondBookAddToCart(){
            clickOnElement(_AddToCartBook2);// User clicks on the second product to add to cart
        }
        public void userClickOnShoppingCart(){
            clickOnElement(_ShoppingCart);//User will click on shopping cart to check selected items
        }


    }
}