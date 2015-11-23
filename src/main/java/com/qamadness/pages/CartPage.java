package com.qamadness.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

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

    public void add_btn(){
        setImplicitTimeout(20, TimeUnit.SECONDS);
        int add_btn = getDriver().findElements(By.partialLinkText("Microsoft Band")).size();
        for (int i=0; i<=add_btn; i++){
            waitForRenderedElementsToBePresent(By.partialLinkText("Microsoft Band")).withTimeoutOf(20, TimeUnit.SECONDS);
            getDriver().findElement(By.partialLinkText("Microsoft Band")).click();
            if(getDriver().findElements(org.openqa.selenium.By.xpath(".//*[@id='add-to-cart-button']")).size()>0){
                add_to_cart_btn.click();
                break;
            }else{
                getDriver().navigate().back();
            }
        }
    }

    @FindBy (xpath = ".//*[@id='hlb-ptc-btn-native']")
    WebElement proceed_to_checkout_btn;
    public void click_proceed_to_checkout_btn() {proceed_to_checkout_btn.click();}

    @FindBy (xpath = ".//*[@id='enterAddressFullName']")
    WebElement full_name_field;
    public void full_name_field_input() {full_name_field.sendKeys("Test Test");}

    @FindBy (xpath = ".//*[@id='enterAddressAddressLine1']")
    WebElement address_line_field;
    public void address_field_input() {address_line_field.sendKeys("Schwalbengasse 14");}

    @FindBy (xpath = ".//*[@id='enterAddressCity']")
    WebElement city_field;
    public void city_field_input() {city_field.sendKeys("Köln");}

    @FindBy (xpath = ".//*[@id='enterAddressStateOrRegion']")
    WebElement state_field;
    public void state_field_input() {state_field.sendKeys("Cologne");}

    @FindBy (xpath = ".//*[@id='enterAddressPostalCode']")
    WebElement zip_field;
    public void zip_field_input() {zip_field.sendKeys("50667");}


    public void select_country_from_dropdown() {
        Select dropdown = new Select(getDriver().findElement(org.openqa.selenium.By.id("enterAddressCountryCode")));
        dropdown.selectByValue("DE");
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

   /* @FindBy (linkText = "Delete")
    WebElement delete_btn;*/
    public void delete_old_address_if_it_present() {
        WebElement delete_btn=getDriver().findElement(org.openqa.selenium.By.linkText("Delete"));
        if (getDriver().findElement(org.openqa.selenium.By.linkText("Delete")).isDisplayed()==true){
            delete_btn.click();
            System.out.println("Old address is Deleted");}
        else
            System.out.println("Address is absent");
    }

    @FindBy (xpath = ".//*[@id='changeQuantityFormId']/table[2]/tbody/tr/td/div/div")
    WebElementFacade error_message;
    public void check_error_message() {
        if (error_message.getText().startsWith("Important Message"))
            System.out.println("Error message is present");
        else
            System.out.println("You can buy this thing");
    }

    public void add_btn2(){
        setImplicitTimeout(20, TimeUnit.SECONDS);
        int add_btn = getDriver().findElements(By.partialLinkText("Nokia Lumia")).size();
        for (int i=0; i<=add_btn; i++){
            waitForRenderedElementsToBePresent(org.openqa.selenium.By.partialLinkText("Nokia Lumia")).withTimeoutOf(20, TimeUnit.SECONDS);
            getDriver().findElement(org.openqa.selenium.By.partialLinkText("Nokia Lumia")).click();
            if(getDriver().findElements(org.openqa.selenium.By.xpath(".//*[@id='add-to-cart-button']")).size()>0){
                add_to_cart_btn.click();
                break;
            }else{
                getDriver().navigate().back();
            }
        }
    }

}
