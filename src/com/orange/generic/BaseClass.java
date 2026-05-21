package com.orange.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.orange.pom.LoginPage;
import com.orange.pom.LogoutPage;

public class BaseClass implements IAutoConstant {

	static WebDriver driver;
	public LoginPage loginpage;
	public LogoutPage logoutpage;
	public FileLib lib;

	@BeforeClass
	public void OpenBrowser() throws IOException {
		driver = new ChromeDriver(); // Launch Chrome browser
		driver.manage().window().maximize(); // Maximize browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lib = new FileLib();
		String url = lib.readPropertyData(PROPERTIES_PATH, "url");
		driver.get(url);
	}

	@BeforeTest
	public void login() throws IOException {
		String username = lib.readPropertyData(PROPERTIES_PATH,"un");
		String password = lib.readPropertyData(PROPERTIES_PATH,"pwd");
		loginpage.getUserNameTextField().sendKeys(username);
		loginpage.getUserNameTextField().sendKeys(password);
		loginpage.getLoginButton().click();
	}

	@AfterTest
	public void logout() {
		logoutpage.getProfileMenuIcon().click();
		logoutpage.getLogoutOption().click();
	}

	@AfterClass
	public void browserClose() throws InterruptedException {
        Thread.sleep(2000);
		driver.quit();
	}
}
