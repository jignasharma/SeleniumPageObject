package org.example;

import org.openqa.selenium.By;

public class IFrame  extends Util
{
private By _topic = By.xpath("//input[@type=\"text\"]");
private By _innerFrameCheckbox = By.xpath("//input[@type=\"checkbox\"]");
private By _selectAnimal       = By.xpath("//select[@class=\"col-lg-3\"]/option[4]");

public void verifyUserIsOnIFramePage()
{
    assertURL("frames-example-selenium-webdriver");
}
public void userEnterDetails()
{
    driver.switchTo().frame(1);
    typetext(_topic, "practice");
    clickOnElement(_innerFrameCheckbox);
    selectFromDropDownByValue(_selectAnimal, "Avatar");
}
}
