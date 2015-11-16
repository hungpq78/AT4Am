package com.qamadness.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

/**
 * Created by Vladislav.E on 09.11.2015.
 */

@DefaultUrl("https://www.amazon.com/")
public class HomePage extends PageObject{



    @FindBy (xpath = ".//*[@id='nav-your-amazon']")
    WebElementFacade yourAmazonLink;
    public void click_your_Amazon_Link() {yourAmazonLink.click();}

    @FindBy (xpath = ".//*[@id='hud-dashboard']/div[2]/div/a")
    WebElementFacade test_account;
    public void check_that_user_is_logged_in() {
        if (test_account.getAttribute("href").equals("/gp/yourstore/home/ref=pd_hud_ysc_cn"))
            System.out.println("User is logged in");
        else
            Assert.fail("User isn't logged in");
    }

    @FindBy (xpath = ".//*[@id='nav-link-yourAccount']/span[2]")
    WebElementFacade myAcc_Link;
    public void click_myAcc_link() {myAcc_Link.click();}

    @FindBy (xpath = ".//*[@id='nav-flyout-yourAccount']/div[2]/a[1]/span")
    WebElementFacade manage_profile;
    public void click_manage_adress() {manage_profile.click();}

    @FindBy (xpath = ".//*[@id='fixed_width']/div[2]/div/div[1]/div[3]/div/div/div[2]/div/div[2]/ul/li[1]/a")
    WebElementFacade manage_adrress_book;
    public void click_manage_adrress_book() {manage_adrress_book.click();}

    @FindBy (xpath = ".//*[@id='iux-address-book']/div[1]/div[1]/a/span")
    WebElementFacade click_add_new_address;
    public void Click_add_new_address_btn() {click_add_new_address.click();}

    @FindBy (xpath = ".//*[@id='twotabsearchtextbox']")
    WebElementFacade serch_field;
    public void input_in_search() {serch_field.sendKeys("Microsoft Band 2");}

    @FindBy (xpath = ".//*[@id='nav-search']/form/div[2]/div/input")
    WebElementFacade serch_btn;
    public void click_search_btn() {serch_btn.click();}

    @FindBy (xpath = ".//*[@id='nav-cart-count']")
    WebElementFacade cart_btn;
    public void click_cart_btn() {cart_btn.click();}

    @FindBy (partialLinkText = "Microsoft Band 2")
    WebElementFacade product_link;
    public void open_some_product() {product_link.click();}

    @FindBy (xpath = ".//*[@id='nav-link-shopall']/span[2]")
    WebElement shop_by_department_link;
    public void click_shop_by_department_link() {shop_by_department_link.click();}

    @FindBy (xpath = ".//*[@id='nav-flyout-shopAll']/div[2]/a/span")
    WebElement full_store_directory_link;
    public void click_full_store_directory_link() {full_store_directory_link.click();}

    @FindBy (xpath = ".//*[@id='shopAllLinks']/tbody/tr/td[2]/div[5]/ul/li[4]/a")
    WebElement cell_phones_link;
    public void click_cell_phones_link() {cell_phones_link.click();}

    @FindBy (linkText = "Smartwatches")
    WebElement smartwatches_link;
    public void click_smartwatches_link() {smartwatches_link.click();}

    @FindBy (xpath = ".//*[@id='ref_2528832011']/li[6]/a/img")
    WebElement choose_only_apple_watches;
    public void click_apple_checkbox() {choose_only_apple_watches.click();}

    @FindBy (partialLinkText = "Apple Watch")
    WebElement apple_watch_link;
    public void open_some_watch() {apple_watch_link.click();}








}
