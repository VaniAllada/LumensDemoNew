package com.lumens.stepdefinations;

import com.lumens.exceldata.ReadExcelFile;
import com.lumens.pages.HomePage;
import com.lumens.pages.Login_PageObject;
import com.lumens.utils.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class Tab_StepDef extends BaseClass {
		
		Login_PageObject Login;
		HomePage tab;
		ReadExcelFile excelFile;
		
		@When("^Navigate to Account and Select signin$")
		public void navigate_to_Account_and_Select_signin() throws Throwable {
			
			Login=new Login_PageObject();
			Login.Account();
		} 
			
			@Then("^cliCk on Lighting and Perform mousover operation on all the fields$")
			public void click_on_Lighting_and_Perform_mousover_operation_on_all_the_fields() throws Throwable {
			    tab=new HomePage();
			    tab.Tab();
		System.out.println("Tab testcase is passed ");
		}
		}



