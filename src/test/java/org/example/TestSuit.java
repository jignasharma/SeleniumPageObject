package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{ HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    Computer_Page computerPage = new Computer_Page();
    DesktopPage desktopPage = new DesktopPage();
    DigitalStorm_Page digitalStorm_page = new DigitalStorm_Page();
    Friend_Email friend_email = new Friend_Email();
    SentEmail_Successfully sentEmail_successfully= new SentEmail_Successfully();
    Books books = new Books();
    AddToCartProduct addToCartProduct = new AddToCartProduct();
    BrowserManager browserManager = new BrowserManager();

    @Test

    public void verifyUserShouldAbleToRegistrationDetails(){
      
    }
}
