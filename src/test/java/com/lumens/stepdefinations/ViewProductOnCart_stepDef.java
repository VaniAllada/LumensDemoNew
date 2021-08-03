package com.lumens.stepdefinations;


	import com.lumens.pages.viewCartPage;
import com.lumens.utils.BaseClass;

import cucumber.api.java.en.Then;

	public class ViewProductOnCart_stepDef extends BaseClass{
		
		viewCartPage viewCart;
		

		@Then("^Mouseover on lightenings and select the product$")
		public void mouseover_on_lightenings_and_select_the_product() throws Throwable {
			viewCart=new viewCartPage();
			viewCart.selectProduct();
			
		}

		@Then("^add the product to the cart$")
		public void add_the_product_to_the_cart() throws Throwable {
			viewCart=new viewCartPage();
			viewCart.addTheProductToCart();
			
			
		}

		@Then("^user is able to view the cart$")
		public void user_is_able_to_view_the_cart() throws Throwable {
			viewCart=new viewCartPage();
			viewCart.viewCart();
			
		}


}
