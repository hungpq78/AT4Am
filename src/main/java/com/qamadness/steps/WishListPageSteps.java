package com.qamadness.steps;

import com.qamadness.pages.WishListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Vladislav.E on 10.11.2015.
 */
public class WishListPageSteps extends ScenarioSteps {

    WishListPage wishListPage;

    @Step
    public void click_add_to_cart_from_wish_list_btn() {wishListPage.click_add_from_list_to_cart_btn();}

    @Step
    public void click_delete_item_from_list_btn() {wishListPage.click_delete_item_from_list_btn();}

    @Step
    public void click_list_settings_btn() {wishListPage.click_list_settings_btn();}

    @Step
    public void click_check_box_delete() {wishListPage.click_check_box_delete();}

    @Step
    public void click_submit_btn() {wishListPage.click_submit_btn();}

    @Step
    public void check_that_list_was_deleted() {wishListPage.check_that_list_was_deleted();}

    @Step
    public void check_that_product_was_deleted() {wishListPage.product_was_deleted();}

    @Step
    public void click_add_to_list_btn() {wishListPage.click_add_to_list_btn();}

    @Step
    public void click_create_list_from_adding_product() {wishListPage.click_create_list_btn();}

    @Step
    public void click_view_wish_list_btn() {wishListPage.click_view_wish_list_btn();}


    @Step
    public void click_delete_from_cart_link() {wishListPage.click_delete_from_cart_link();}

    @Step
    public void click_list_with_product_link() {wishListPage.click_link_to_list_with_product();}

    @Step
    public void click_wish_list_btn() {wishListPage.click_wish_list_link();}


}
