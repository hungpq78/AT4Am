package com.qamadness.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Vladislav.E on 11.11.2015.
 */
public class CartPage extends PageObject {

    @FindBy (xpath = ".//*[@id='add-to-cart-button']")
    WebElementFacade add_to_cart_btn;
    public void click_add_to_cart_btn() {add_to_cart_btn.click();}
    public void check_add_product_btn_and_click_it() {
        if (add_to_cart_btn.isDisplayed())
            add_to_cart_btn.click();
        else
           getDriver().navigate().back();

    }
    /////////// Just commit////////////////////////////

    @FindBy (xpath = ".//*[@id='hlb-ptc-btn-native']")
    WebElement proceed_to_checkout_btn;
    public void click_proceed_to_checkout_btn() {proceed_to_checkout_btn.click();}

    @FindBy (xpath = ".//*[@id='enterAddressFullName']")
    WebElement full_name_field;
    public void full_name_field_input() {full_name_field.sendKeys("Test Test");}

    @FindBy (xpath = ".//*[@id='enterAddressAddressLine1']")
    WebElement address_line_field;
    public void address_field_input() {address_line_field.sendKeys("5334 NE 49th Ave");}

    @FindBy (xpath = ".//*[@id='enterAddressCity']")
    WebElement city_field;
    public void city_field_input() {city_field.sendKeys("Portland");}

    @FindBy (xpath = ".//*[@id='enterAddressStateOrRegion']")
    WebElement state_field;
    public void state_field_input() {state_field.sendKeys("Oregon");}

    @FindBy (xpath = ".//*[@id='enterAddressPostalCode']")
    WebElement zip_field;
    public void zip_field_input() {zip_field.sendKeys("97218");}

    @FindBy (xpath = ".//*[@id='enterAddressCountryCode']")
    WebElement country_dropdown;
    public void select_country_from_dropdown() {
        Select dropdown = new Select(getDriver().findElement(org.openqa.selenium.By.id("enterAddressCountryCode")));
        dropdown.selectByValue("US");
    }

    @FindBy (xpath = ".//*[@id='enterAddressPhoneNumber']")
    WebElement phone_number_field;
    public void phone_number_input() {phone_number_field.sendKeys("+11111111111");}

    @FindBy (xpath = ".//*[@id='newShippingAddressFormFromIdentity']/div[1]/div/form/div[7]/span/span/input")
    WebElement continue_btn;
    public void click_continue_btn() {continue_btn.click();}

    @FindBy (xpath = ".//*[@id='shippingOptionFormId']/div[3]/div/div/span[1]/span/input")
    WebElement continue_btn_from_shipping;
    public void click_continue_btn_from_shipping_step() {continue_btn_from_shipping.click();}

    @FindBy (linkText = "Delete")
    WebElement delete_btn;
    public void delete_old_address_if_it_present() {
        if (delete_btn.getText().equals("Delete"))
            delete_btn.click();
        else
            System.out.println("Address is absent");
    }



}
