package org.example;

import org.openqa.selenium.By;

public class RegisterPage  extends Util {
    // Registration Locators
    private By _gender = By.id("gender-female");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirthday = By.name("DateOfBirthDay");
    private By _monthOfBirthDay = By.name("DateOfBirthMonth");
    private By _yearOfBirthDay = By.name("DateOfBirthYear");
    private By _Email = By.id("Email");
    private By _companyName = By.id("Company");
    private By _checkBox = By.xpath("//input[@type=\"checkbox\"]");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");


    public void userEnterRegistrationDetails(){
        //Enter all the registration details
        clickOnElement(_gender);
        typetext(_firstName, "Jigna");
        typetext(_lastName,"Sharma");
        selectFromDropDownByIndex(_dateOfBirthday,23);
        selectFromDropDownByIndex(_monthOfBirthDay, 5);
        selectFromDropDownByIndex(_yearOfBirthDay, 1987);
        typetext(_Email, "sharmajigna1+"+timestamp()+"@gmail.com");
        typetext(_companyName, "JKltd");
        clickOnElement(_checkBox);
        typetext(_password, "jj12345");
        typetext(_confirmPassword, "jj12345");
        clickOnElement(_registerButton);




    }

}