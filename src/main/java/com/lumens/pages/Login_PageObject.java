package com.lumens.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utils.BaseClass;

public class Login_PageObject extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/button/i")
	WebElement Account;
	
	@FindBy(linkText="Sign In")
	WebElement signup;
	
	@FindBy(id="dwfrm_login_username")
	WebElement Email;

	@FindBy(id="dwfrm_login_password")
	WebElement Password;
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement submit;
	
	@FindBy(xpath="//*[@id='ltkpopup-close-button']")
	WebElement closePopup;
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]"
			+ "/header/div[2]/div[4]/ul/li[2]/div/div/div/a")
	WebElement Logoutlink;
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div")
	WebElement Account2;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[1]/div/a")
	WebElement Logout;
	
	public Login_PageObject() {
		PageFactory.initElements(driver, this);
	}
	
	public void Account() {
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ltkpopup-close-button']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", closePopup);
		closePopup.click();
		
		Account.getLocation();
		Actions action=new Actions(driver);
		action.moveToElement(Account).build().perform();
		signup.click();
}
	public void logintoLumens(String email, String password) throws Exception {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_username")));		
		Email.sendKeys(email);
		
		Thread.sleep(2000);
		 WebDriverWait wait1 = new WebDriverWait(driver,50);
		 wait1.until(ExpectedConditions.elementToBeClickable(By.id("dwfrm_login_password")));
		 Password.sendKeys(password);
		 submit.click();
		
	}
	
}





