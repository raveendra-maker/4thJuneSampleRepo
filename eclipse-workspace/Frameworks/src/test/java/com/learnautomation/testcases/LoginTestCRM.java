package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utilities.BrowserFactory;
import com.learnautomation.utilities.ExcelDataProvider;

public class LoginTestCRM extends BaseClass {
WebDriver driver;
	

	
	@Test
	public void loginApp()
	{
		ExcelDataProvider excel=new ExcelDataProvider();
				
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.LoginToCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
						
	}
}
