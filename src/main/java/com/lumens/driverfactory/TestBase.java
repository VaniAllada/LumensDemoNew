package com.lumens.driverfactory;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	 public static  Properties prop;
	 protected static  WebDriver driver;
	
		public  TestBase() {
			try{
				prop=new Properties();
				FileInputStream fi=new FileInputStream("C:\\Users\\LENOVO\\EclipseNew\\LumensProjectSample\\src\\main\\java\\com\\lumens\\config\\config.properties");
				prop.load(fi);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
	 
	
	 
	public static void browserInitialization() {
		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverpath"));
		driver=new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
}
