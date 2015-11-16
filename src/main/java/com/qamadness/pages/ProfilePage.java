package com.qamadness.pages;


import net.thucydides.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Vladislav.E on 10.11.2015.
 */
public class ProfilePage extends PageObject {

/////////////////////////////////////////////////////////////////////// Add New Address Elements /////////////////////////////////////////////////////
    @FindBy (xpath = ".//*[@id='enterAddressFullName']")
    WebElementFacade name_field;
    public void input_name() {name_field.sendKeys("Test");}

    @FindBy (xpath = ".//*[@id='enterAddressAddressLine1']")
    WebElementFacade address_line;
    public void input_address() {address_line.sendKeys("Test 4344");}

    @FindBy (xpath = ".//*[@id='enterAddressCity']")
    WebElementFacade city_field;
    public void input_city() {city_field.sendKeys("Test");}

    @FindBy (xpath = ".//*[@id='enterAddressStateOrRegion']")
    WebElementFacade state_field;
    public void input_state() {state_field.sendKeys("Testovaya oblast");}

    @FindBy (xpath = ".//*[@id='enterAddressPostalCode']")
    WebElementFacade zip_field;
    public void input_zip_code() {zip_field.sendKeys("64604");}

    @FindBy (xpath = ".//*[@id='enterAddressPhoneNumber']")
    WebElementFacade phone_field;
    public void input_phone_number() {phone_field.sendKeys("+111111111111111111");}

    @FindBy (xpath = ".//*[@id='GateCode']")
    WebElementFacade access_code_field;
    public void input_access_code() {access_code_field.sendKeys("091212lol");}

    public void select_country() {
        Select dropdown = new Select(getDriver().findElement(By.xpath(".//*[@id='enterAddressCountryCode']")));
        dropdown.selectByValue("UA");
    }

    public void select_delivery() {
        Select dropdown = new Select(getDriver().findElement(By.xpath(".//*[@id='AddressType']")));
        dropdown.selectByValue("RES");
    }

    @FindBy (xpath = ".//*[@id='myab_newAddressButton']")
    WebElementFacade save_btn;
    public void click_save_btn() {save_btn.click();}

    @FindBy (xpath = ".//*[@id='myab_AddrBookDeleteAddr_1']/span")
    WebElementFacade delete_btn;
    public void delete_address() {delete_btn.click();}

    @FindBy (xpath = ".//*[@id='icam_deleteAddressButton']/span")
    WebElementFacade confirm_btn;
    public void click_confirm_btn() {confirm_btn.click();}

    @FindBy (xpath = ".//*[@id='address-index-1']/td[2]/div/ul/li[1]/b")
    WebElementFacade user_name;
    public void check_that_address_was_added() {
        if (user_name.getText().equals("Test"))
            System.out.println("Address was added");
        else
            Assert.fail("Fail");
    }

    ///////////////////////////////////////////////////////////////////////  Manage Address Elements ///////////////////////////////////////////////////////

    @FindBy (xpath = ".//*[@id='myab_AddrBookEditAddr_1']/span")
    WebElementFacade edit_btn;
    public void click_edit_btn() {edit_btn.click();}

    @FindBy (xpath = ".//*[@id='enterAddressFullName']")
    WebElementFacade field_name;
    public void change_name() {field_name.clear();field_name.sendKeys("Change Test");}

    @FindBy (xpath = ".//*[@id='enterAddressAddressLine1']")
    WebElementFacade address_field;
    public void change_address() {address_field.clear();address_field.sendKeys("Change Test");}

    @FindBy (xpath = ".//*[@id='enterAddressCity']")
    WebElementFacade field_city;
    public void change_city() {field_city.clear();field_city.sendKeys("Change Test");}

    @FindBy (xpath = ".//*[@id='enterAddressStateOrRegion']")
    WebElementFacade field_state;
    public void change_state() {field_state.clear();field_state.sendKeys("Changed Oblast");}

    @FindBy (xpath = ".//*[@id='enterAddressPostalCode']")
    WebElementFacade field_zip;
    public void change_zip() {field_zip.clear();field_zip.sendKeys("11111");}

    public void change_country() {
        Select dropdown = new Select(getDriver().findElement(By.xpath(".//*[@id='enterAddressCountryCode']")));
        dropdown.selectByValue("AF");
    }

    @FindBy (xpath = ".//*[@id='enterAddressPhoneNumber']")
    WebElementFacade field_phone;
    public void change_number() {field_phone.clear();field_phone.sendKeys("+1232434354541");}

    public void change_delivery() {
        Select dropdown = new Select(getDriver().findElement(By.xpath(".//*[@id='AddressType']")));
        dropdown.selectByValue("COM");
    }


    public void change_access_code() {access_code_field.clear();access_code_field.sendKeys("000000");}

    @FindBy (xpath = ".//*[@id='myab_editAddressButton']")
    WebElementFacade edit_address;
    public void click_edit_address() {edit_address.click();}

    @FindBy (xpath = ".//*[@id='address-index-1']/td[2]/div/ul/li[1]/b")
    WebElementFacade changed_user_name;
    public void check_that_address_was_changed() {
        if (changed_user_name.getText().equals("Change Test"))
            System.out.println("Address was added");
        else
            Assert.fail("Fail");
    }

    @FindBy (xpath = ".//*[@id='default-address-and-1-click-settings']/p")
    WebElementFacade message_that_address_is_absent;
    public void check_that_address_was_deleted() {
        if (message_that_address_is_absent.getText().equals("You do not currently have a default 1-click address set.  You can set one by adding a new address."))
            System.out.println("Address was deleted");
        else
            Assert.fail("Address is Enable");
    }








}