package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactPage;
	contactPage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	public ContactsPageTest() {
		super();
	}
		
	@BeforeMethod
	public void setUp() {
		Initialization();
		testUtil = new TestUtil();
		contactPage = new ContactsPage();
		loginpage = new LoginPage();
		homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void VerifyCreateNewContactPage() {
		contactPage.VerifyCreateNewContact(Fname, Lname);
	}
	
	
	
	
	
	
}
