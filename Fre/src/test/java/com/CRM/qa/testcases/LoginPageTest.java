package com.CRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;
import com.CRM.qa.Pages.SignUpPage;
import com.CRM.qa.testbase.TestBase;



public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage  homePage;
	SignUpPage signPage;
	
	public LoginPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
	}
	@Test(priority =1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
		
	}
	@Test(priority =2)
	public void crmLogoImageTest() {
		Boolean flag =loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	
	}
	@Test(priority =3)
	public void logintest() {
		
		homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	
		
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
