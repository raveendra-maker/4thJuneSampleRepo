package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utilities.BrowserFactory;
import com.learnautomation.utilities.ConfigDataProvider;
import com.learnautomation.utilities.ExcelDataProvider;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite() 
	{
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setUp() 
	{
		BrowserFactory.startApplication(driver, config.getBrowser(), config.getStangingURL());
	}
	
	
	@AfterClass
	public void tearDown() 
	{
		BrowserFactory.quitBrowser(driver);
	}
	

}
