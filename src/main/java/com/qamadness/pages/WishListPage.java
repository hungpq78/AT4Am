package com.qamadness.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Vladislav.E on 10.11.2015.
 */
public class WishListPage extends PageObject {

    @FindBy (linkText = "Add to Cart")
    WebElementFacade add_to_cart_from_wish_list_btn;
    public void click_add_from_list_to_cart_btn() {add_to_cart_from_wish_list_btn.click();}

    @FindBy (partialLinkText= "Delete")
    WebElementFacade delete_item_from_list_btn;
    public void click_delete_item_from_list_btn() {delete_item_from_list_btn.click();}

    @FindBy (xpath = ".//*[@id='wishlist-page']/ul/div/a[2]")
    WebElementFacade list_settings_btn;
    public void click_list_settings_btn() {list_settings_btn.click();}

    @FindBy (xpath = ".//*[@id='g-manage-table-wishlist']/tbody/tr[2]/td[5]/div/label/input")
    WebElementFacade delete_check_box;
    public void click_check_box_delete() {delete_check_box.click();}

    @FindBy (xpath = ".//*[@id='g-manage-form']/div[2]/span/span/span/input")
    WebElementFacade submit_btn;
    public void click_submit_btn() {submit_btn.click();}

    public void check_that_list_was_deleted() {
        WebElement delete_message= getDriver().findElement(By.className("a-nowrap"));
        if (delete_message.getText().equals("Get Started"))
            System.out.println("List was Deleted");
        else
            Assert.fail("Fail");
    }

    @FindBy (xpath = ".//*[@id='nav-cart-count']")
    WebElementFacade product_quantity;
    public void product_was_deleted() {
        if (product_quantity.getText().equals("0"))
            System.out.println(" Product was deleted  ");
        else
            Assert.fail("Fail");
    }

    /////////////////////////////////////////////////////////////////////////  Add product to wishlist Elements ////////////


    @FindBy (xpath = ".//*[@id='add-to-wishlist-button-submit']")
    WebElementFacade add_to_list_btn;
    public void click_add_to_list_btn() {add_to_list_btn.click();}

    @FindBy (xpath = "html/body/div[5]/input")
    WebElementFacade create_list_btn;
    public void click_create_list_btn() {create_list_btn.click();}

    @FindBy (xpath = ".//*[@id='WLHUC_viewlist']/span/span")
    WebElementFacade view_wish_list_btn;
    public void click_view_wish_list_btn() {view_wish_list_btn.click();}

    @FindBy (xpath = ".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[1]/div/div/div[2]/div/span[1]/span/input")
    WebElementFacade delete_from_cart_link;
    public void click_delete_from_cart_link() {delete_from_cart_link.click();}

    @FindBy (xpath = ".//*[@id='nav-link-wishlist']/span[2]")
    WebElementFacade wish_list_link;
    public void click_wish_list_link() {wish_list_link.click();}

    @FindBy (xpath = ".//*[@id='wishlist-page']/ul/div/a[2]")
    WebElementFacade link_to_list_with_product;
    public void click_link_to_list_with_product() {link_to_list_with_product.click();}




}
