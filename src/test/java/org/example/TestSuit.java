package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest { //Created Objects for test suit
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    Computer_Page computerPage = new Computer_Page();
    DesktopPage desktopPage = new DesktopPage();
    DigitalStorm_Page digitalStorm_page = new DigitalStorm_Page();
    Friend_Email friend_email = new Friend_Email();
    SentEmail_Successfully sentEmail_successfully = new SentEmail_Successfully();
    Books books                       = new Books();
    AddToCartProduct addToCartProduct = new AddToCartProduct();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    BrowserManager browserManager = new BrowserManager();
    NewOnlineStore newOnlineStore = new NewOnlineStore();
    FaceBookPage faceBookPage     = new FaceBookPage();
    IFrame iFrame                = new IFrame();

    @Test

    public void verifyUserShouldAbleToRegistrationDetails() { // Method to verify registration details
        //verify user is on home page
        homePage.verifyUserIsOnHomepage();
        //click on register button
        homePage.clickOnRegisterButton();
        //verify user is on register page
        registerPage.verifyUserIsOnRegisterPage();
        //user enters register details
        registerPage.userEnterRegistrationDetails();

        //click on submit button
        registerPage.userClickOnSubmitsButton();
        //verify user on register successful page
        registerSuccessPage.verifyUserIsOnRegisterResultPage();
        // getting verifying massage
        registerSuccessPage.userCanSeeSuccessfulMessage();


    }

    @Test

    public void userShouldBeReferAProductToAFriendSuccessfully() {
        //verify user is on home page
        homePage.verifyUserIsOnHomepage();
        //click on register button
        homePage.clickOnRegisterButton();
        //verify user is on register page
        registerPage.userEnterRegistrationDetails();
        //user enters register details
        //registerPage.userClickOnRegisterSubmitButton();
        //click on submit button

        //verify user on register successful page
        // registerSuccessPage.verifyUserIsOnRegisterSuccessfullyPage();
        // getting verifying massage
        //  registerSuccessPage.userSeeRegisterSuccessfullyMessage();
        // verify user is on computer page
        computerPage.verifyUserIsOnComputerPage();
        computerPage.userShouldClickOnDesktop();
        desktopPage.verifyUserIsOnComputerPage();
        desktopPage.userClickOnDigitalStorm();
    }

    @Test
    public void verifyEachProductList() {
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='item-grid']/div[1]/div[1]/div[2]"));


        }

    @Test
    public void  userShouldClickOnSearchButton()
    {
        homePage.userShouldClickOnSearchButton();
       //  Sleep1(2000);
        driver.switchTo().alert().getText(); // User should get alert message

        driver.switchTo().alert().dismiss(); // User select alert option

    }
    @Test

   public void userShouldSuccessfullySendComments()//Method for user send New online store comments
    {
     homePage.userClickOnNewOnlineStore();
     newOnlineStore.userIsOnNewOnlineStorePage();
     newOnlineStore.userInputComment();
     newOnlineStore.verifyNewCommentSuccessfully();

     List<WebElement> lastComment = driver.findElements(By.linkText("//div[@class=\"comments\"]/div/div[2]/div[3]"));
     //Used List Object and method to get last comment
       System.out.println("lastComment :" +lastComment.size());
       for (WebElement comment:lastComment)
       {
           WebElement webElement = lastComment.get(lastComment.lastIndexOf(0)-1);
           System.out.println(comment.getText());
       }


    }
    @Test

    public void userShouldCreateFaceBookPageSuccessfully()//User should be on facebook create page
    {
        homePage.userShouldClickOnFacebook();
        faceBookPage.verifyUserIsOnFacebookPage();


    }
@Test
    public void verifyUserSeeEuroSymbol()// Verify Euro symbol
{
    homePage.userShouldClickOnCurrencyButton();
}

@Test
    public void verifyUserIsOnIFrameExample()
{
    iFrame.verifyUserIsOnIFramePage();
    iFrame.userEnterDetails();
}

    }



