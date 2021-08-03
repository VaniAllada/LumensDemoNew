package com.lumens.stepdefinations;



import java.util.concurrent.TimeUnit;

import com.lumens.utils.BaseClass;
import cucumber.api.java.After;

	public class Hooks extends BaseClass{
		
		@After
		public void closeBrowser() throws Exception {
			Thread.sleep(20000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.quit();
		}

	}



