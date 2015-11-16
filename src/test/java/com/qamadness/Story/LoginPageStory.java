package com.qamadness.Story;

import com.qamadness.pages.LoginPage;
import com.qamadness.steps.HomePageSteps;
import com.qamadness.steps.LoginPageSteps;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vladislav.E on 09.11.2015.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(ThucydidesRunner.class)
public class LoginPageStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginPageSteps loginPageSteps;


    @Issue("#Incorrect Login/Password")
    @Test
    public void Incorrect_Login_Password(){

        homePageSteps.open_Amazon();
        homePageSteps.open_login_page();
        loginPageSteps.input_incorrect_email();
        loginPageSteps.input_incorrect_password();
        loginPageSteps.click_sign_in_btn();
        loginPageSteps.check_error_message();
        homePageSteps.getDriver().close();
    }


    @Issue("#Correct Login/Password")
    @Test
    public void Correct_Login_Password() {


        homePageSteps.open_Amazon();
        homePageSteps.open_login_page();
        loginPageSteps.input_email();
        loginPageSteps.input_password();
        loginPageSteps.click_sign_in_btn();
        //homePageSteps.check_that_user_is_logged_in();
        homePageSteps.getDriver().close();
    }



}
