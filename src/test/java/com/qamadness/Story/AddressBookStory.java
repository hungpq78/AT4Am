package com.qamadness.Story;

import com.qamadness.pages.LoginPage;
import com.qamadness.steps.HomePageSteps;
import com.qamadness.steps.LoginPageSteps;
import com.qamadness.steps.ProfilePageSteps;
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

@RunWith(ThucydidesRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddressBookStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    ProfilePageSteps profilePageSteps;


    @Issue("#Add new Address")
    @Test
    public void Add_new_Address()  {

        homePageSteps.open_Amazon();
        homePageSteps.open_login_page();
        loginPageSteps.input_email();
        loginPageSteps.input_password();
        loginPageSteps.click_sign_in_btn();

        homePageSteps.click_myAcc_link();
        homePageSteps.click_manage_adress();

        homePageSteps.Click_add_new_address_btn();
        profilePageSteps.input_name();
        profilePageSteps.input_address();
        profilePageSteps.input_city();
        profilePageSteps.input_state();
        profilePageSteps.input_zip();
        profilePageSteps.choose_country();
        profilePageSteps.input_phone();
        profilePageSteps.choose_delivery();
        profilePageSteps.input_access_code();
        profilePageSteps.click_save_btn();
        profilePageSteps.check_that_address_was_added();
        homePageSteps.getDriver().close();
    }


    @Issue("#Delete Address")
    @Test
    public void Delete_Address() {

        homePageSteps.open_Amazon();
        homePageSteps.open_login_page();
        loginPageSteps.input_email();
        loginPageSteps.input_password();
        loginPageSteps.click_sign_in_btn();
        homePageSteps.click_myAcc_link();
        homePageSteps.click_manage_adress();

        profilePageSteps.delete_address();
        profilePageSteps.click_confirm_btn();
        profilePageSteps.check_that_address_was_deleted();
        homePageSteps.getDriver().close();
    }


    @Issue("#Edit Address")
    @Test
    public void Edit_Address() {

        homePageSteps.open_Amazon();
        homePageSteps.open_login_page();
        loginPageSteps.input_email();
        loginPageSteps.input_password();
        loginPageSteps.click_sign_in_btn();
        homePageSteps.click_myAcc_link();
        homePageSteps.click_manage_adress();

        homePageSteps.Click_add_new_address_btn();
        profilePageSteps.input_name();
        profilePageSteps.input_address();
        profilePageSteps.input_city();
        profilePageSteps.input_state();
        profilePageSteps.input_zip();
        profilePageSteps.choose_country();
        profilePageSteps.input_phone();
        profilePageSteps.choose_delivery();
        profilePageSteps.input_access_code();
        profilePageSteps.click_save_btn();
        profilePageSteps.click_edit_btn();
        profilePageSteps.change_name();
        profilePageSteps.change_address();
        profilePageSteps.change_city();
        profilePageSteps.change_state();
        profilePageSteps.change_zip();
        profilePageSteps.change_country();
        profilePageSteps.change_number();
        profilePageSteps.change_delivery();
        profilePageSteps.change_access_code();
        profilePageSteps.click_edit_address();
        profilePageSteps.check_that_address_was_changed();
        profilePageSteps.delete_address();
        profilePageSteps.click_confirm_btn();
        homePageSteps.getDriver().close();

    }
}
