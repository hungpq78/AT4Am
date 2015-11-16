package com.qamadness.steps;

import com.qamadness.pages.HomePage;
import com.qamadness.pages.ProfilePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


/**
 * Created by Vladislav.E on 10.11.2015.
 */

public class ProfilePageSteps extends ScenarioSteps {

    ProfilePage profilePage;

    ////////////////////////////////////////////////////////////  Add Address Steps ////////////////////////////////////
    @Step
    public void choose_country() {profilePage.select_country();}

    @Step
    public void choose_delivery() {profilePage.select_delivery();}

    @Step
    public void input_name() {profilePage.input_name();}

    @Step
    public void input_address() {profilePage.input_address();}

    @Step
    public void input_city() {profilePage.input_city();}

    @Step
    public void input_state() {profilePage.input_state();}

    @Step
    public void input_zip() {profilePage.input_zip_code();}

    @Step
    public void input_phone() {profilePage.input_phone_number();}

    @Step
    public void input_access_code() {profilePage.input_access_code();}

    @Step
    public void click_save_btn() {profilePage.click_save_btn();}

    @Step
    public void delete_address() {profilePage.delete_address();}

    @Step
    public void click_confirm_btn() {profilePage.click_confirm_btn();}

    @Step
    public void check_that_address_was_added() {profilePage.check_that_address_was_added();}



    //////////////////////////////////////////////////////////  Change Address Code/////////////////////////////////////


    @Step
    public void click_edit_btn() {profilePage.click_edit_btn();}

    @Step
    public void change_name() {profilePage.change_name();}

    @Step
    public void change_address() {profilePage.change_address();}

    @Step
    public void change_city() {profilePage.change_city();}

    @Step
    public void change_state() {profilePage.change_state();}

    @Step
    public void change_zip() {profilePage.change_zip();}

    @Step
    public void change_country() {profilePage.change_country();}

    @Step
    public void change_number() {profilePage.change_number();}

    @Step
    public void change_delivery() {profilePage.change_delivery();}

    @Step
    public void change_access_code() {profilePage.change_access_code();}

    @Step
    public void click_edit_address() {profilePage.click_edit_address();}

    @Step
    public void check_that_address_was_changed() {profilePage.check_that_address_was_changed();}

    @Step
    public void check_that_address_was_deleted() {profilePage.check_that_address_was_deleted();}





}
