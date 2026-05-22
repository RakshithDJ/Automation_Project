package com.orange.generic;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orange.pom.LoginPage;
import com.orange.pom.LogoutPage;

public class BaseClass implements IAutoConstant {

	public static WebDriver driver;
	public LoginPage loginpage;
	public LogoutPage logoutpage;
	public FileLib lib;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Create explicit wait for admin
																					// actions

	@BeforeClass
	public void OpenBrowser() throws IOException {
		driver = new ChromeDriver(); // Launch Chrome browser
		driver.manage().window().maximize(); // Maximize browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lib = new FileLib();
		String url = lib.readPropertyData(PROPERTIES_PATH, "url");
		driver.get(url);
		Reporter.log("Browser Opened and Navigated to URL: " + url, true);
	}

	@BeforeMethod
	public void login() throws IOException {                                      
		loginpage = new LoginPage(driver);
		String username = lib.readPropertyData(PROPERTIES_PATH, "un");
		String password = lib.readPropertyData(PROPERTIES_PATH, "pwd");
		loginpage.getUserNameTextField().sendKeys(username);
		loginpage.getPasswordTextField().sendKeys(password);
		loginpage.getLoginButton().click();
		Reporter.log("Logged in with username: " + username, true);
	}

	@AfterMethod                                     
	public void logout() {
		logoutpage = new LogoutPage(driver);
		logoutpage.getProfileMenuIcon().click();
		logoutpage.getLogoutOption().click();
		Reporter.log("Logged out successfully", true);
	}

	@AfterClass(alwaysRun = true)
	public void browserClose() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		Reporter.log("Browser closed successfully", true);
	}

}

