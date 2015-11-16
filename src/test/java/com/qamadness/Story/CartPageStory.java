package com.qamadness.Story;

import com.qamadness.steps.CartPageSteps;
import com.qamadness.steps.HomePageSteps;
import com.qamadness.steps.LoginPageSteps;
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

    @Issue("#Add product to Cart from search")
    @Test
    @Pending
    public void add_product_to_cart() {
        homePageSteps.open_Amazon();
        homePageSteps.input_in_search_field();
        homePageSteps.click_search_btn();
        homePageSteps.open_product();
        //cartPageSteps.click_add_to_cart_btn();
        cartPageSteps.check_add_product_btn_and_click_it();
        cartPageSteps.click_proceed_to_checkout_btn();
        loginPageSteps.input_email();
        loginPageSteps.input_password();
        loginPageSteps.click_sign_in_btn();
        cartPageSteps.delete_old_address_if_it_present();
        cartPageSteps.full_name_field_input();
        cartPageSteps.address_field_input();
        cartPageSteps.city_field_input();
        cartPageSteps.state_field_input();
        cartPageSteps.zip_field_input();
        cartPageSteps.phone_number_input();
        cartPageSteps.click_continue_btn();
        cartPageSteps.click_continue_btn_from_shipping_step();

    }

    @Issue("Add product from categories")
    @Test
    public void add_product_from_categories() {
        homePageSteps.open_Amazon();
        homePageSteps.click_shop_by_department_link();
        homePageSteps.click_full_store_directory_link();
        homePageSteps.click_cell_phones_link();
        homePageSteps.click_smartwatches_link();
        homePageSteps.click_apple_checkbox();
        homePageSteps.open_some_watch();
        cartPageSteps.click_add_to_cart_btn();
        //cartPageSteps.check_add_product_btn_and_click_it();
        cartPageSteps.click_proceed_to_checkout_btn();
        loginPageSteps.input_email();
        loginPageSteps.input_password();
        loginPageSteps.click_sign_in_btn();
        cartPageSteps.delete_old_address_if_it_present();
        cartPageSteps.full_name_field_input();
        cartPageSteps.address_field_input();
        cartPageSteps.city_field_input();
        cartPageSteps.state_field_input();
        cartPageSteps.zip_field_input();
        cartPageSteps.phone_number_input();
        cartPageSteps.click_continue_btn();
        cartPageSteps.click_continue_btn_from_shipping_step();
    }

}