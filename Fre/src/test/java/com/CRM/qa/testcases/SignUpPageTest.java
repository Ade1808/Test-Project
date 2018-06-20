package com.CRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.Pages.LoginPage;
import com.CRM.qa.Pages.ProfileDetails;
import com.CRM.qa.Pages.SignUpPage;
import com.CRM.qa.testbase.TestBase;

public class SignUpPageTest extends TestBase {
	SignUpPage signUpPage;
	ProfileDetails profileDetails;
	TestBase testBase;
	
	
	public SignUpPageTest() {
		super();
		
		
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		testBase= new TestBase();
		
	}
	
	@Test(priority = 1)
	public void ClickSignUp() {
		signUpPage.ClickSignUp();
	}
	@Test(priority=2)
		public void SignUpPageTitleTest() {
		String title = signUpPage.ValidateSignUpPageTitle();
		Assert.assertEquals(title, "CRM Pro for customer relationship management, sales, and support");
		}

	
	@Test(priority=3)
	public void freeCRMlogoTest() {
		Boolean image = signUpPage.validateCRMImage();
		Assert.assertTrue(image);
	}
	@Test(priority=4)
	public void RegisterTest() {
		profileDetails=signUpPage.Register(prop.getProperty("FirstName"),prop.getProperty("LastName"), prop.getProperty("Email"), prop.getProperty("ConfirmEmail"), prop.getProperty("username1"), prop.getProperty("password1"), prop.getProperty("ConfirmPassword"));
				
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
