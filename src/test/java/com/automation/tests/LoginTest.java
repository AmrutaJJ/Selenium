package com.automation.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void testLogin() {
		// Create an instance of LoginPage
		LoginPage loginPage = new LoginPage(driver);

		// Perform login
		loginPage.login("9890211111", "Zentech@123");

		String expectedURL = "https://helloproduct.azurewebsites.net/";
		String actualURL = driver.getCurrentUrl();

		Assert.assertEquals(actualURL, expectedURL, "Login Failed: URL Mismatch");
		
		
	}
}
