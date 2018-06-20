package com.CRM.qa.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CRM.qa.testbase.TestBase;

public class SignUpPage extends TestBase {
	
	
	//Object Factory OR
	
	@FindBy(name="payment_plan_id")
	WebElement PaymentPlan;
	
	@FindBy(name="first_name")
	WebElement FirstName;
	
	@FindBy(name="surname")
	WebElement LastName;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="email_confirm")
	WebElement ConfirmEmail;
	
	@FindBy(name="username")
	WebElement username1;
	
	@FindBy(name="password")
	WebElement password1;
	
	@FindBy(name="passwordconfirm")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement CheckBox;
	
	@FindBy(name="submitButton")
	WebElement Register;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement freecrmlogo;
	
	@FindBy(xpath ="//button[@type='button']")
	WebElement SignUp;
	
	
	// initialize the page Object 

	public SignUpPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	// Actions and features
	
	
	public SignUpPage ClickSignUp() {
		
		SignUp.click();
		
		return new SignUpPage();
		
	}
	
	
	public String ValidateSignUpPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public Boolean validateCRMImage() {
		
		return freecrmlogo.isDisplayed();
		
	}
	
	public ProfileDetails Register(String fn, String ln, Boolean em, Boolean cm, String un, String Pw, String Cpw ) {
		
		PaymentPlan.click();
		Select dropdown = new Select(PaymentPlan);
		dropdown.getFirstSelectedOption();
		
		return new ProfileDetails();
		
		
		
	}

	public ProfileDetails Register(String property, String property2, String property3, String property4,
			String property5, String property6, String property7) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}



