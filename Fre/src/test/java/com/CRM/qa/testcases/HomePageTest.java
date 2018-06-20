package com.CRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.DealsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;
import com.CRM.qa.Pages.TasksPage;
import com.CRM.qa.Util.TestUtil;
import com.CRM.qa.testbase.TestBase;

public class HomePageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	TasksPage tasksPage;
	

	
public HomePageTest() {
		
		super();
		
}
 
	@BeforeMethod
	public void setUp(){
	initialization();
	loginPage = new LoginPage();
	homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	testUtil = new TestUtil();
	contactsPage = new ContactsPage();
	dealsPage = new DealsPage();
	tasksPage = new TasksPage();
	
	
}

@Test(priority=2)
public void verifyUserNameTest() {
	Assert.assertTrue(homePage.verifyCorrectUserName());
	
}
@Test(priority=1)
public void verifyHomePageTitleTest() {
	
	String hometitle = homePage.verifyHomePageTitle();
	Assert.assertEquals(hometitle, "CRMPRO", "Title is not Matched");
	
}

@Test(priority=3)
public void ClickOnContactLinkTest() {
	testUtil.switchToFrame();
	contactsPage = homePage.ClickOnContactLink();
	
	Assert.assertTrue(false);
	
}

@Test(priority = 4)
public void ClickOnDealsLinkTest() {
	testUtil.switchToFrame();
	
	dealsPage = homePage.ClickOnDealsLink();
	Assert.assertTrue(false);
}

@Test(priority = 5)
public void ClickOnTasksLinkTest() {
	testUtil.switchToFrame();
	
	tasksPage  = homePage.ClickOnTasksLink();
	Assert.assertTrue(false);
}


@AfterMethod
public void tearDown() {
	
	driver.quit();
}
	

}
