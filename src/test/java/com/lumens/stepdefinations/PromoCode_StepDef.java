package com.lumens.stepdefinations;

import java.util.ArrayList;

import com.lumens.exceldata.ReadExcelFile;


import cucumber.api.java.en.Then;

public class PromoCode_StepDef {
	ReadExcelFile	excelFile=new ReadExcelFile();
	
    com.lumens.pages.PromoCodePage promo=new com.lumens.pages.PromoCodePage();
   
    @Then("^user should click on cart and enter the coupon code and click apply$")
    public void user_should_click_on_cart_and_enter_the_coupon_code_and_click_apply() throws Throwable {
    	ArrayList<String> testdata=excelFile.getData("user1");
         promo.applyCouponCode(testdata.get(5));
    }

}
