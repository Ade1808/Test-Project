package com.CRM.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;
import com.CRM.qa.Util.TestUtil;
import com.CRM.qa.testbase.TestBase;

import junit.framework.Assert;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	TestUtil testUtil;
	HomePage homePage;
	ContactsPage contactsPage;
	
	
	
	public ContactsPageTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	@Test(priority= 1)
	public void ContactLabel() {
		boolean label= contactsPage.ContactLabel();
		Assert.assertEquals(label, "Contacts");
	}
	
	
	@Test(priority= 2)
	public void ContactsStatus() {
		contactsPage.Contactstatus();
		
		
	}
	@Test(priority= 3)
	public void ContactsCategoryTest() {
		contactsPage.Categorystatus();
		
	}
	@Test (priority= 4)
	public void ContactsNameTest() {
		
		contactsPage.NameofContact();
		Assert.assertEquals("", "");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	

}
