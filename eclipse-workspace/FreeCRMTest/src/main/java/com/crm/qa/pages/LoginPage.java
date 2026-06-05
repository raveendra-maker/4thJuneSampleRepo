package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
//page Factory or object repository

@FindBy(xpath="//span[text()='Log In']")
WebElement loginLink;
	
@FindBy(name="email")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="//div[text()='Login']")
WebElement loginBtn;

@FindBy(xpath="//button[text()='Sign Up']")
WebElement signUpBtn;

@FindBy(xpath="(//img[contains(@alt,'free crm logo')])[1]")
WebElement crmLogo;

//Initialization of page objects
public LoginPage() {
	PageFactory.initElements(driver, this); //PageFactory.initElements(driver, this);
	                                        //this is current class object.
}

//Actions
public String validateLoginPageTitle() {
	return driver.getTitle();
	}

public boolean validateCRMImage() {
	return crmLogo.isDisplayed();
	}

public HomePage	login(String un, String pwd) {
	loginLink.click();
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginBtn.click();
	return new HomePage();
}





	
	
}

