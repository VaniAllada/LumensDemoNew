package com.lumens.stepdefinations;

import com.lumens.pages.NavigateBackToHomePage;


import cucumber.api.java.en.Then;

public class NavigateBack_StepDef {
	
	NavigateBackToHomePage navigate=new NavigateBackToHomePage();
	   
    @Then("^user should able to navigate the lights and navigate back to the homepage$")
    public void user_should_able_to_navigate_the_lights_and_navigate_back_to_the_homepage() throws Throwable {
        navigate.mouseoveronlighting();
    }

}
