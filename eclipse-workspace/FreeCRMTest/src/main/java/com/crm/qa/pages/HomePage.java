package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
@FindBy(xpath=".//a[text()='Free account']")
WebElement userNameLabel;

@FindBy(xpath="//span[text()='Contacts']")
WebElement contactsLink;

@FindBy(xpath="//span[text()='Deals']")
WebElement dealsLink;

@FindBy(xpath="//span[text()='Tasks']")
WebElement tasksLink;

//Initialization of page objects
public HomePage() {
	PageFactory.initElements(driver,this);
	
}
public String verifyHomePageTitle() {
	return driver.getTitle();
}

public boolean verifyCorrectUserName() {
	return userNameLabel.isDisplayed();
}
public ContactsPage clickOnContactsLink() {
	contactsLink.click();
	return new ContactsPage();
}

public DealsPage clickOnDealsLink() {
	dealsLink.click();
	return new DealsPage();
	
}

public TasksPage clickOnTasksLink() {
	tasksLink.click();
	return new TasksPage();

}

}
