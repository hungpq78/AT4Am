package com.qamadness.steps;

import com.qamadness.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Vladislav.E on 09.11.2015.
 */
public class LoginPageSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void input_incorrect_email() {loginPage.input_incorrect_email();}

    @Step
    public void input_incorrect_password() {loginPage.input_incorrect_password();}

    @Step
    public void check_error_message() {loginPage.check_error_message();}

    @Step
    public void input_email() {loginPage.input_email();}

    @Step
    public void input_password() {loginPage.input_password();}

    @Step
    public void click_sign_in_btn() {loginPage.click_sign_in_btn();}
}
