package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.testbase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'User: Ade Rasaki')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	
	// Initialise the page Object 

		public HomePage() {
			
			PageFactory.initElements(driver, this);
			
		}
		
		
		// Actions of the Page
		public String verifyHomePageTitle() {
			
			return driver.getTitle();
						
		}
		public boolean verifyCorrectUserName() {
			return userNameLabel.isDisplayed();
			
		}
		
		public ContactsPage ClickOnContactLink() {
		
		contactsLink.click();
		return new  ContactsPage();
		
		
	}
	
	public DealsPage ClickOnDealsLink() {
		
		dealsLink.click();
		return new DealsPage();
		
	}
	
	
	public TasksPage ClickOnTasksLink() {
		
		tasksLink.click();
		return new TasksPage();
		
		
	}
	
	
	
	
	

}
