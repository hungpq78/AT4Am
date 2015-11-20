package com.qamadness.Story;

import com.qamadness.steps.CartPageSteps;
import com.qamadness.steps.HomePageSteps;
import com.qamadness.steps.LoginPageSteps;
import com.qamadness.steps.WishListPageSteps;
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
 * Created by Vladislav.E on 10.11.2015.
 */
@RunWith(ThucydidesRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WishListStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    WishListPageSteps wishListPageSteps;

    @Steps
    CartPageSteps cartPageSteps;

    @Issue("#Add product to WishList")
    @Test
    public void add_product_to_wishlist() {
        homePageSteps.open_Amazon();
        homePageSteps.input_in_search_field();
        homePageSteps.click_search_btn();
        //cartPageSteps.test_check_ad_btn();
        homePageSteps.open_product();
        wishListPageSteps.click_add_to_list_btn();
        loginPageSteps.input_email();
        loginPageSteps.input_password();
        loginPageSteps.click_sign_in_btn();
        wishListPageSteps.click_create_list_from_adding_product();
        wishListPageSteps.click_view_wish_list_btn();
        wishListPageSteps.click_add_to_cart_from_wish_list_btn();
        homePageSteps.click_cart_btn();
        wishListPageSteps.click_delete_from_cart_link();
        wishListPageSteps.check_that_product_was_deleted();
        wishListPageSteps.click_wish_list_btn();
        //wishListPageSteps.click_list_with_product_link();
        wishListPageSteps.click_delete_item_from_list_btn();
        wishListPageSteps.click_list_settings_btn();
        wishListPageSteps.click_check_box_delete();
        wishListPageSteps.click_submit_btn();
        wishListPageSteps.check_that_list_was_deleted();
        homePageSteps.getDriver().close();

    }
}
