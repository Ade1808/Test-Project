package com.CRM.qa.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.CRM.qa.testbase.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT =40;
	public static long IMPLICITY_WAIT =30;
	
	
	public void switchToFrame() {
		driver.switchTo().frame("frame");
		
		
	}
	
	public void Dropdowns() {
		WebElement testdropDown = driver.findElement(By.name("cs-status"));
		Select dropdown = new Select(testdropDown);
	}
	

}
