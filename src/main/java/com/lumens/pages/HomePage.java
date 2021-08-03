package com.lumens.pages;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.lumens.utils.BaseClass;

	public class HomePage extends BaseClass {
		
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
		
		@FindBy(xpath="//*[@id=\"nav-tab-01\"]/a/span[1]")
		WebElement lighting;
		
		@FindBy(xpath="//*[@id=\"nav-tab-01\"]/ul/li/div[1]/span/a")
		WebElement CeilingLights;
		
		@FindBy(xpath="//span[contains(text(),'fans')]")
		WebElement Fans;
		
		@FindBy(xpath="//span[contains(text(),'furniture')]")
		WebElement Furniture;
		
		@FindBy(xpath="//*[@id=\"nav-tab-06\"]/a/span[1]")
		WebElement Brands;
		
		@FindBy(xpath="//img[@alt='Shop All Ceiling Fans']")
		WebElement ceilingFans;
		
		
		@FindBy(xpath="//img[@alt='Shop All Gus Modern']")
		WebElement gusModern;
		
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public void Account() {
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", closePopup);
			closePopup.click();
			Account.getLocation();
			Actions action=new Actions(driver);
			action.moveToElement(Account).build().perform();
			signup.click();
	}
		public void logintoLumens(String email, String password) throws InterruptedException {
			 Thread.sleep(2000);
			 WebDriverWait wait = new WebDriverWait(driver,70);

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Email);
			Email.sendKeys(email);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Password);
			Password.sendKeys(password);
			submit.click();
			
			
		}
		

		public void VerifyTitle() {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.lumens.com/");
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", closePopup);
			//closePopup.click();
			
			 System.out.println(driver.getTitle());   
			Assert.assertEquals("Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com", driver.getTitle());
	    
	        TakesScreenshot ts=(TakesScreenshot)driver;        
		    File source=ts.getScreenshotAs(OutputType.FILE);
		    try {
				FileUtils.copyFile(source, new File("C:\\Users\\LENOVO\\EclipseNew\\LumensProjectSample\\Screenshots\\VerifyTitle.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		    System.out.println("verify title screenshot is taken");
			
		}
		
		public void Tab() throws Exception {
			
			 WebDriverWait wait = new WebDriverWait(driver,60);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-tab-01\"]/a/span[1]")));
			//Thread.sleep(20000);			
			//lighting.getLocation();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			Actions action=new Actions(driver);
			action.moveToElement(lighting).build().perform();
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		       js.executeScript("arguments[0].click();", lighting);

			
			action.moveToElement(Fans).build().perform();
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
		       js.executeScript("arguments[0].click();", Fans);
			
			action.moveToElement(Furniture).build().perform();
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
		       js.executeScript("arguments[0].click();", Furniture);
			action.moveToElement(Brands).build().perform();
		}
		public void Scrolldown(){
	        JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    }
	   
	    public void Scrollup(){
	        JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	    }

	}
