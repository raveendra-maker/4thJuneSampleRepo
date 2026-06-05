package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactPage;
	//DealsPage DealsPage;
			
	public HomePageTest() {
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
	public void verifyHomePageTitleTest() {
	String homePageTitle = homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "Free CRM", "Home page title not matched");
	}
	
	@Test
	public void verifyUserNameTest() {
		//testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
		
	}
	
	@Test
	public void verifyContactsLinkTest() {
		//testUtil.switchToFrame();
		contactPage=homePage.clickOnContactsLink();
		
	}
	
	@Test
	public void verifyDealsLinkTest() {
		//testUtil.switchToFrame();
		//DealsPage=homePage.clickOnDealsLink();
				
	}
	
	@Test
	public void verifyTasksLinkTest() {
		//testUtil.switchToFrame();
		//TasksPage=homePage.clickOnTasksLink();
				
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	}


