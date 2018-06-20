package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	
	
	//Page Factory ( Object Repository)
	@FindBy(name ="username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//initializing Page Objects 
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Actions or Feature available on the Page
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public Boolean validateCRMImage() {
		
		crmLogo.isDisplayed();
		
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new  HomePage();
		
		
	}
	

	
	
	
	
	
	
	
}
