package com.lumens.stepdefinations;

import com.lumens.pages.viewCartPage;

import cucumber.api.java.en.Then;

public class ViewCart_StepDef {
	
	viewCartPage View=new viewCartPage();
	
	@Then("^Selcted Product and click on cart in HomePage$")
	public void selcted_Product_and_click_on_cart_in_HomePage() throws Throwable {
	    View.selectProduct();
	    View.addTheProductToCart();
	    View.viewCart();
	}


}
