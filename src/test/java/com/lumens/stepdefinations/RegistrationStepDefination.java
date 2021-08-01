package com.lumens.stepdefinations;

import java.util.ArrayList;

import com.lumens.driverfactory.TestBase;
import com.lumens.pages.Registration;
import com.lumens.utils.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationStepDefination extends TestBase {
	ExcelReader excelData=new ExcelReader();
	Registration account=new Registration();
	
	@Given("^user able to open browser and enter url$")
	public void user_able_to_open_browser_and_enter_url() throws Throwable {
		TestBase.browserInitialization();
	}

	@Then("^user able to mouseover on account and select my account$")
	public void user_able_to_mouseover_on_account_and_select_my_account() throws Throwable {
		account.AccountCreationPage();
	    account.mouseOverOnAccountAndClickMyAccount();
	}

	@Then("^user able to fill details for account creation$")
	public void user_able_to_fill_details_for_account_creation() throws Throwable {
		account.AccountCreationPage();
		ArrayList<String> testdata=excelData.getData("user1");
	    account.fillDetails(testdata.get(1), testdata.get(2),
	    		testdata.get(3), testdata.get(4), testdata.get(5), testdata.get(6));
	}

	@Then("^user able to click createaccount button$")
	public void user_able_to_click_createaccount_button() throws Throwable {
		account.AccountCreationPage();
	   account.createAccount();
	}
}
