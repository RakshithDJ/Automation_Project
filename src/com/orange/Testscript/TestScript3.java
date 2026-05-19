package com.orange.Testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * This TestScript is used to validate title of the webpage using assertion.
 *@author rakshith.s
 */
public class TestScript3 {

	static WebDriver driver; // Declare a static WebDriver instance to be shared across all test methods

	@Test(priority = 0)
	public void OpenBrowser() {
		driver = new ChromeDriver(); // Launch Chrome browser
		driver.manage().window().maximize(); // Maximize browser window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Open OrangeHRM login page
		Reporter.log("Test Case Pass ", true);
	}

	@Test(priority = 1, dependsOnMethods = "OpenBrowser")
	public void verifiyTitle() {
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle); // Soft assertion to compare actual and expected titles
		s.assertAll(); // Collate and report all assertion results
		Reporter.log("TestScript3 Pass", true); // Log test execution status in TestNG report
	}

	@Test(priority = 2, invocationCount = 1, enabled = true)
	public void closeBrowser() {
		driver.quit(); // Code to close browser and end WebDriver session
		Reporter.log("Test Case Pass ", true);
	}

}
