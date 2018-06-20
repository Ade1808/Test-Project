package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.Util.TestUtil;
import com.CRM.qa.testbase.TestBase;

public class ContactsPage extends TestBase {
	TestUtil testUtil;
	
	
	@FindBy(name="cs_status")
	WebElement status;
	
	@FindBy(name="cs_category")
	WebElement category;
	@FindBy(name="cs_name")
	WebElement name;
	@FindBy(name="cs_company_name")
	WebElement companyName;
	@FindBy(name="cs_email")
	WebElement email;
	@FindBy(name="cs_extended")
	WebElement extended;
	@FindBy(name="cs_notes")
	WebElement notes;
	@FindBy(name="cs_industry")
	WebElement industry;
	@FindBy(name="by_user")
	WebElement owner;
	@FindBy(name="tags")
	WebElement tags;
	@FindBy(name="cs_address")
	WebElement address;
	@FindBy(name="cs_address_type")
	WebElement addresstype;
	@FindBy(name="cs_default_address")
	WebElement checkbox;
	@FindBy(name="view_id")
	WebElement viewid;
	@FindBy(name="cs_saved_search_id")
	WebElement savedsearch;
	@FindBy(name="cs_save_search")
	WebElement savesearch;
	@FindBy(xpath="//td[@text='contacts']")
	WebElement contactLabel;
	
	// initialize Page
	public ContactsPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Action of the Page
	
	public boolean ContactLabel() {
		return  contactLabel.isDisplayed();
		
	}
	
	public boolean Contactstatus() {
		
		return status.isSelected();
	}
	
	public boolean Categorystatus() {
		return category.isEnabled();
		
	}
	public void NameofContact() {
		name.sendKeys("");
		
	}
	
	public void CompanyName() {
		companyName.sendKeys("");
		
	}
	public void ContactsEmail() {
		
		email.sendKeys("");
	}
	
	public void ExtendedFields() {
		extended.sendKeys("");
	}
	
	public void ContactsNotes() {
		
		notes.sendKeys("");
	}
	
	public void ContactsIndustry() {
		
		industry.sendKeys("");
		
		
	}
	public void Owner() {
		owner.isSelected();
	}
	
	public void Tags() {
		
		tags.sendKeys("");
		
	}
	public void Address() {
		address.sendKeys("");
	}
	
	public void AddressType() {
		addresstype.isSelected();
	}
	
	public void CheckBox() {
		checkbox.isSelected();
		
	}
	
	
	
	
	
	
	
	
	

}
