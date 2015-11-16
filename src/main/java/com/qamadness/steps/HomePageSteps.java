package com.qamadness.steps;

import com.qamadness.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Vladislav.E on 09.11.2015.
 */
public class HomePageSteps extends ScenarioSteps {

    HomePage homePage;


    @Step
    public void open_Amazon() {homePage.open();}

    @Step
    public void open_login_page() {homePage.click_your_Amazon_Link();}

    @Step
    public void check_that_user_is_logged_in() {homePage.check_that_user_is_logged_in();}

    @Step
    public void click_manage_adress() {homePage.click_manage_adress();}

    @Step
    public void click_myAcc_link() {homePage.click_myAcc_link();}

    @Step
    public void click_manage_adrress_book() {homePage.click_manage_adrress_book();}

    @Step
    public void Click_add_new_address_btn() {homePage.Click_add_new_address_btn();}

    @Step
    public void input_in_search_field(){homePage.input_in_search();}

    @Step
    public void click_search_btn() {homePage.click_search_btn();}

    @Step
    public void open_product() {homePage.open_some_product();}

    @Step
    public void click_cart_btn() {homePage.click_cart_btn();}

    @Step
    public void click_shop_by_department_link() {homePage.click_shop_by_department_link();}

    @Step
    public void click_full_store_directory_link() {homePage.click_full_store_directory_link();}

    @Step
    public void click_cell_phones_link() {homePage.click_cell_phones_link();}

    @Step
    public void click_phones_link() {homePage.click_phones_link();}

    @Step
    public void click_apple_checkbox() {homePage.click_apple_checkbox();}

    @Step
    public void open_some_phone() {homePage.open_some_phone();}

    @Step
    public void hover_shop_by_department_link() {homePage.hover_shop_by_department_link();}

}
