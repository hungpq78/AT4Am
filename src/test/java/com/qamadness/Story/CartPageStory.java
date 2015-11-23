package com.qamadness.Story;

import com.qamadness.steps.CartPageSteps;
import com.qamadness.steps.HomePageSteps;
import com.qamadness.steps.LoginPageSteps;
import com.qamadness.steps.ProfilePageSteps;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vladislav.E on 11.11.2015.
 */

@RunWith(ThucydidesRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CartPageStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    CartPageSteps cartPageSteps;

    @Steps
    ProfilePageSteps profilePageSteps;

    @Issue("#Add product to Cart from search")
    @Test
    //@Pending
    public void add_product_to_cart() {
        homePageSteps.open_Amazon();
        homePageSteps.input_in_search_field();
        homePageSteps.click_search_btn();

        cartPageSteps.test_check_ad_btn();
        cartPageSteps.click_proceed_to_checkout_btn();
        loginPageSteps.input_email();
        loginPageSteps.input_password();
        loginPageSteps.click_sign_in_btn();
        cartPageSteps.full_name_field_input();
        cartPageSteps.address_field_input();
        cartPageSteps.city_field_input();
        cartPageSteps.state_field_input();
        cartPageSteps.zip_field_input();
        cartPageSteps.choose_country();
        cartPageSteps.phone_number_input();
        cartPageSteps.click_continue_btn();
        cartPageSteps.check_error_message();
        homePageSteps.open_Amazon();
        homePageSteps.click_myAcc_link();
        homePageSteps.click_manage_adress();
        profilePageSteps.delete_address();
        profilePageSteps.click_confirm_btn();
        profilePageSteps.check_that_address_was_deleted();
        homePageSteps.getDriver().close();


    }

    @Issue("Add product from categories")
    @Test
    //@Pending
    public void add_product_from_categories() {
        homePageSteps.open_Amazon();
        homePageSteps.hover_shop_by_department_link();
        homePageSteps.click_cell_phones_link();
        homePageSteps.click_phones_link();
        homePageSteps.click_apple_checkbox();
        cartPageSteps.test_check_prod();
        cartPageSteps.click_proceed_to_checkout_btn();
        loginPageSteps.input_email();
        loginPageSteps.input_password();
        loginPageSteps.click_sign_in_btn();
        cartPageSteps.full_name_field_input();
        cartPageSteps.address_field_input();
        cartPageSteps.city_field_input();
        cartPageSteps.state_field_input();
        cartPageSteps.zip_field_input();
        cartPageSteps.choose_country();
        cartPageSteps.phone_number_input();
        cartPageSteps.click_continue_btn();
        cartPageSteps.check_error_message();
        homePageSteps.open_Amazon();
        homePageSteps.click_myAcc_link();
        homePageSteps.click_manage_adress();
        profilePageSteps.delete_address();
        profilePageSteps.click_confirm_btn();
        profilePageSteps.check_that_address_was_deleted();
        homePageSteps.getDriver().close();

    }

}