package com.lumens.stepdefinations;
	
	import java.util.ArrayList;

import com.lumens.exceldata.ReadExcelFile;
import com.lumens.pages.LiveChatLoginPage;

import cucumber.api.java.en.Then;

	public class LiveChatLogin_StepDef  {
		
		LiveChatLoginPage live=new LiveChatLoginPage();
		ReadExcelFile excelFile;
		
		@Then("^user should click livechat on homepage and login with valid credentials$")
		public void user_should_click_livechat_on_homepage_and_login_with_valid_credentials() throws Throwable {
			 excelFile=new ReadExcelFile();
			live.mouseOverOnAccountAndClickMyAccount(); 
		
			ArrayList<String> testdata=excelFile.getData("user1");
			live.liveChatLogin(testdata.get(1), testdata.get(3));

		}

	}


