package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
	

public class BaseTest {
    protected static WebDriver driver;
    protected static ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void setup() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://helloproduct.azurewebsites.net/");
        
    }

    @AfterSuite
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
        if (extent != null) {
            extent.flush(); 
        }
    }
}
