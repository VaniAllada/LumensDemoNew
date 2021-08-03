package com.lumens.stepdefinations;



import com.lumens.pages.ZipCodePage;

import cucumber.api.java.en.Then;

public class ZipCode_StepDef {
	 ZipCodePage zipCode = new ZipCodePage();
	 
	 
	    
	    @Then("^enter the zipCode$")
	    public void enter_the_zipCode() throws Throwable {
	        
	        zipCode.enterZipCode();

	}
}



