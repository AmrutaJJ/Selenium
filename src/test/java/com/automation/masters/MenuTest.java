package com.automation.masters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
//import com.automation.pages.LoginPage;

	public class MenuTest extends BaseTest {
	    private WebDriverWait wait;

	    @BeforeClass
	    public void setUpMenuNavigation() {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	      /* // Login
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("admin", "Admin@123");*/

	        // Wait for dashboard/home to load fully
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.cssSelector("div[class='noDropDown ng-star-inserted is-active'] b")));

	        // Navigate to Masters > Menu
	        WebElement mastersMenu = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//button[@class='accordion-button ng-star-inserted collapsed']")));
	        mastersMenu.click();

	        WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//a[normalize-space()='Menu']")));
	        menuItem.click();

	        // Wait until Menu page loads
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//input[@id='mat-input-4']")));
	    }

	    @Test
	    public void testMenuFilter() {
	        // Add your actual test logic here
	        // e.g., apply filter, verify results, etc.
	        System.out.println("Running testMenuFilter...");
	    }
	}

