package com.lumens.stepdefinations;

	
import com.lumens.pages.RemoveProductPage;

import cucumber.api.java.en.Then;

	public class RemoveProduct_StepDef {
		
		@Then("^Selcted Product add to cart and click on cart in HomePage$")
		public void selcted_Product_add_to_cart_and_click_on_cart_in_HomePage() throws Throwable {
			RemoveProductPage removeItem=new RemoveProductPage();		
			removeItem.navigatingToLargeChandelier();		
			removeItem.selectProductAndAddToCart();	    
		}

		@Then("^Remove Product from the Cart$")
		public void remove_Product_from_the_Cart() throws Throwable {		
			RemoveProductPage removeItem=new RemoveProductPage();		
			removeItem.removeProduct();		
			System.out.println("User successfully Remove The Product From The Cart");
		   
		}

	}
