package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// http://qa.seamlessly.net/index.php/login
public class SeamlesslyLoginPage extends BasePage {

    @FindBy(id = "user")
    public WebElement userInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement submitformInput;

    @FindBy(css = "img[src='/core/img/actions/toggle.svg']")
    public WebElement elementImg;

    @FindBy(id = "lost-password")
    public WebElement lostpasswordLink;

    @FindBy(xpath = "//a[normalize-space(text()) = 'Log in with a device']")
    public WebElement elementLink;

    @FindBy(css = ".info")
    public WebElement infoP;





}