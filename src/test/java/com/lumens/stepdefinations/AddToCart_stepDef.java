package com.lumens.stepdefinations;

import com.lumens.pages.Addtocart_Page;


import cucumber.api.java.en.Then;

public class AddToCart_stepDef {
	

	Addtocart_Page cart= new Addtocart_Page();
	
	
	@Then("^user able to navigate to ligthings and Large Chandelier$")
	public void user_able_to_navigate_to_ligthings_and_Large_Chandelier() throws Throwable {
		cart.navigatingToLargeChandelier();
	}

	@Then("^user is able to select the product and add to cart$")
	public void user_is_able_to_select_the_product_and_add_to_cart() throws Throwable {
		 cart.selectProductAndAddToCart();
	}

}
