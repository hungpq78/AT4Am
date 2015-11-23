package com.qamadness.steps;

import com.qamadness.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Vladislav.E on 11.11.2015.
 */
public class CartPageSteps extends ScenarioSteps {

    CartPage cartPage;

    @Step
    public void click_add_to_cart_btn() {cartPage.click_add_to_cart_btn();}

    @Step
    public void click_proceed_to_checkout_btn() {cartPage.click_proceed_to_checkout_btn();}

    @Step
    public void full_name_field_input() {cartPage.full_name_field_input();}

    @Step
    public void address_field_input() {cartPage.address_field_input();}

    @Step
    public void city_field_input() {cartPage.city_field_input();}

    @Step
    public void state_field_input() {cartPage.state_field_input();}

    @Step
    public void zip_field_input() {cartPage.zip_field_input();}

    @Step
    public void choose_country () {cartPage.select_country_from_dropdown();}

    @Step
    public void phone_number_input() {cartPage.phone_number_input();}

    @Step
    public void click_continue_btn() {cartPage.click_continue_btn();}

    @Step
    public void click_continue_btn_from_shipping_step() {cartPage.click_continue_btn_from_shipping_step();}

    @Step
    public void delete_old_address_if_it_present() {cartPage.delete_old_address_if_it_present();}

    @Step
    public void check_add_product_btn_and_click_it() {cartPage.check_add_product_btn_and_click_it();}

    @Step
    public void check_error_message() {cartPage.check_error_message();}

    @Step
    public void test_check_ad_btn() {cartPage.add_btn();}

    @Step
    public void test_check_prod() {cartPage.add_btn2();}

}
