package com.automation.masters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MastersPage {
	private WebDriver driver;
	// Locators
	private By mastersDropdown = By.cssSelector(".accordion-button.ng-star-inserted.collapsed"); 
	private By menuOption = By.xpath("//a[normalize-space()='Menu']"); 
	//protected By exportButton = By.id("export-button");

	
	public void clickMastersDropdown() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(mastersDropdown)).click();
	}
	public void clickMenuOption() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(menuOption)).click();
	}
	
	
	
	// Combined method to navigate to Menu Module
	public void navigateToMenuModule() {
			clickMastersDropdown(); // Click Masters
			clickMenuOption(); // Click Menu
	}	
}
	/*
	// Search with Dynamic Filter ID
	public void search(String keyword, String filterFieldId) {
		By searchBox = By.id(filterFieldId);
		driver.findElement(searchBox).clear();
		driver.findElement(searchBox).sendKeys(keyword);
	}

	// Export to Excel
	public void exportToExcel() {
		driver.findElement(exportButton).click();
	}
}
*/
