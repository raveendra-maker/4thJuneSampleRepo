package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends HomePage {
	

@FindBy (xpath=".//button[contains(text(),'Create')]")
WebElement ContactCreate;
	
@FindBy (name="first_name")
WebElement ContactFirstName;

@FindBy (name="last_name")
WebElement ContactLastName;

@FindBy (name="category")
WebElement ContactCategory;

@FindBy (xpath=".//span[contains(text(),'Lead')]")
WebElement LeadDropDown;

@FindBy (xpath=".//button[contains(text(),'Save')]")
WebElement SaveButton;

//Initialization of page objects
public ContactsPage() {
	PageFactory.initElements(driver, this);
}
public void VerifyCreateNewContact(String Fname, String Lname) {
	ContactCreate.click();
	ContactFirstName.sendKeys(Fname);
	ContactLastName.sendKeys(Lname);
	ContactCategory.click();
	LeadDropDown.click();
	SaveButton.click();
	return;
}
	

}

