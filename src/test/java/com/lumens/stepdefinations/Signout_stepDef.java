package com.lumens.stepdefinations;

import com.lumens.pages.SignoutPage;


import cucumber.api.java.en.Then;

public class Signout_stepDef {
	
SignoutPage signOut=new SignoutPage();
	
	@Then("^again mousehover on account click on signOut$")
	public void again_mousehover_on_account_click_on_signOut() throws Throwable {
	    signOut.signOut();
	}

}
