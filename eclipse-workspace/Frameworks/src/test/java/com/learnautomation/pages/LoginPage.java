package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	@FindBy(name="USERNAME") WebElement uname;
	@FindBy(name="PASSWORD") WebElement pass;
	@FindBy(xpath="//input[@value='Login']") WebElement loginButton;
	
	public void LoginToCRM(String usernameApplication,String passwordApplication)
	{
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
	}
