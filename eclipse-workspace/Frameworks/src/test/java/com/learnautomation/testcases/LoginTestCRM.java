package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utilities.BrowserFactory;
import com.learnautomation.utilities.ConfigDataProvider;
import com.learnautomation.utilities.ExcelDataProvider;

public class LoginTestCRM extends BaseClass {
WebDriver driver;
//ExcelDataProvider excel;

	
	@Test
	public void loginApp()
	
	{
		
		//excel=new ExcelDataProvider();
		//logger=report.createTest("Login to CRM");
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		//logger.info("Starting application");
		
		loginpage.LoginToCRM(excel.getStringData("Login",0,0), excel.getStringData("Login",0,1));
		
						
	}
}
