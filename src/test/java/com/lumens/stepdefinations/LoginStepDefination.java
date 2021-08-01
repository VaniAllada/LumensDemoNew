package com.lumens.stepdefinations;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lumens.driverfactory.TestBase;
import com.lumens.pages.LoginPage;
import com.lumens.utils.ExcelReader;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination extends TestBase {
	LoginPage login=new LoginPage();
	ExcelReader excelData=new ExcelReader();
	
	@When("^Mouse over to account and click sign In button$")
	public void mouse_over_to_account_and_click_sign_In_button() throws Throwable {
		login.selectSignIn();
	}

	@Then("^Enter the valid credentials$")
	public void enter_the_valid_credentials() throws Throwable {
		  ArrayList<String> testdata=excelData.getData("Login");
	      login.login(testdata.get(1), testdata.get(2));
	}

}
