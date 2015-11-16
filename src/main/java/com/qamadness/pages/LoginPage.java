package com.qamadness.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;


/**
 * Created by Vladislav.E on 09.11.2015.
 */
public class LoginPage extends PageObject {

    @FindBy (xpath = ".//*[@id='ap_email']")
    WebElementFacade emailField;
    public void input_email() {emailField.clear();emailField.sendKeys("autotests@i.ua");}
    public void input_incorrect_email() {emailField.sendKeys("autotests@i.ua");}

    @FindBy (xpath = ".//*[@id='ap_password']")
    WebElementFacade passwordField;
    public void input_password() {passwordField.clear();passwordField.sendKeys("autotest");}
    public void input_incorrect_password() {passwordField.sendKeys("autotest1");}

    @FindBy (xpath = ".//*[@id='signInSubmit']")
    WebElementFacade signInBtn;
    public void click_sign_in_btn() {signInBtn.click();}

    @FindBy (xpath = ".//*[@id='auth-error-message-box']/div/div/ul/li/span")
    WebElementFacade errorMessage;
    public void check_error_message() {
        if (errorMessage.getText().equals("There was an error with your E-Mail/ Password combination. Please try again."))
            System.out.println("Error message is present");
        else
            Assert.fail("Fail");
    }



}
