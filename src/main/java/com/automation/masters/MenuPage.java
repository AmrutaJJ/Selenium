	package com.automation.masters;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class MenuPage {
	    WebDriver driver;

	    public MenuPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // === WebElements ===
	    @FindBy(xpath = "//input[@id='mat-input-3']")  // Adjust placeholder if needed
	    private WebElement filterInput;

	  /*  @FindBy(xpath = "//button[contains(text(),'Add New')]")  // Update locator if needed
	    private WebElement addNewButton;*/

	    @FindBy(xpath = "//span[normalize-space()='EXPORT TO EXCEL']")
	    private WebElement exportToExcelButton;

	    // === Actions ===
	    public void filterMenu(String keyword) {
	        filterInput.clear();
	        filterInput.sendKeys(keyword);
	    }

	  /*  public void clickAddNew() {
	        addNewButton.click();
	    } */

	    public void clickExportToExcel() {
	        exportToExcelButton.click();
	    }
	}
	
	

