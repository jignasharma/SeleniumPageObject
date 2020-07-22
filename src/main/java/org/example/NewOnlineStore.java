package org.example;

import org.openqa.selenium.By;

public class NewOnlineStore extends Util
    // Locators for all requirements
{
    private By _Title = By.id("AddNewComment_CommentTitle");
    private By _Comment = By.id("AddNewComment_CommentText");
    private By _NewComment = By.name("add-comment");
    String Expected = "News comment is successfully added.";
    private By _successMessage = By.xpath("//div[@class=\"result\"]");
    public void userIsOnNewOnlineStorePage()
    {
        assertURL("new-online-store-is-open");// Comparing the  URL

    }
    public void userInputComment() // method for input the title and comment
    {
        typetext(_Title, "Sharma");
        typetext(_Comment, "Om Namah Shivay");
        clickOnElement(_NewComment);

    }
    public void verifyNewCommentSuccessfully() // compare the expected and actual message
    {
        assertTextMessage(getTextFromElement(_successMessage),Expected, "User cant see the message");
        System.out.println(_successMessage);


    }
}