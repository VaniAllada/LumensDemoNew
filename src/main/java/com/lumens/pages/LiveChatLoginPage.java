package com.lumens.pages;


	import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.lumens.utils.BaseClass;

	

	public class LiveChatLoginPage extends BaseClass {
		
		@FindBy(xpath="//a[@class='ltkpopup-close']")
		WebElement popup;
		
		@FindBy(xpath="//div[@class='btn-group dropdown-group']")
		WebElement mouseOverOnAccount;
		
		@FindBy(id="my_account_hdr_link")
		WebElement selectMyAccount;
		
		@FindBy(xpath="//div[contains(text(),'Live Chat')]")
		WebElement liveChat;
		
		@FindBy(xpath="//input[@id='txt_4616424']")
		WebElement name;
		
		@FindBy(xpath="//input[@id='txt_4616425']")
		WebElement enterEmail;
		
		@FindBy(xpath="//button[text()='Submit']")
		WebElement submit;
		
		 public LiveChatLoginPage() {
	   	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         PageFactory.initElements(driver, this);
		            
		        }
		 public void mouseOverOnAccountAndClickMyAccount() {
			 WebDriverWait wait1 = new WebDriverWait(driver,100);
				Actions act=new Actions(driver);
				act.moveToElement(mouseOverOnAccount).build().perform();
			
				 JavascriptExecutor js = (JavascriptExecutor) driver;
			       js.executeScript("arguments[0].click();", selectMyAccount);
				
				
			}

			  
			   public void liveChatLogin(String username,String email) {
				   
				 
				   WebDriverWait wait = new WebDriverWait(driver,100);
				   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Live Chat')]")));
				   	
				   JavascriptExecutor js = (JavascriptExecutor) driver;
			       js.executeScript("arguments[0].click();", liveChat);
			       
				   WebDriverWait wait1 = new WebDriverWait(driver,50);
				   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_4616424']")));
				   name.sendKeys(username);
				   WebDriverWait waits = new WebDriverWait(driver,50);
				   waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_4616425']")));
				   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				   enterEmail.sendKeys(email);
				   
				   submit.click();
				   
				   TakesScreenshot ts=(TakesScreenshot)driver;        
				    File source=ts.getScreenshotAs(OutputType.FILE);
				    try {
						FileUtils.copyFile(source, new File("./ScreenShots/LiveChat.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
				    System.out.println("live chat login screenshot is taken");
				   System.out.println("live chat login succesfull");
				   
				   
			   }

	}


