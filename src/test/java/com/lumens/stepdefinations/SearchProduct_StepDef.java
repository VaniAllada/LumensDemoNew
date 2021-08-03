package com.lumens.stepdefinations;

import java.util.ArrayList;
import com.lumens.pages.SearchProductPage;

import cucumber.api.java.en.Then;

	public class SearchProduct_StepDef {
		
		SearchProductPage search=new SearchProductPage();
		
		@Then("^user should enter the product name and able to search that product in search bar$")
		public void user_should_enter_the_product_name_and_able_to_search_that_product_in_search_bar() throws Throwable {
		    
			 search.searchProduct();
		}
}
