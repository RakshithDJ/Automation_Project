package com.orange.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.orange.pom.LoginPage;
import com.orange.pom.LogoutPage;

public class BaseClass implements IAutoConstant {
	public  WebDriver driver;
	public LoginPage loginpage;
	public LogoutPage logoutpage;
	public FileLib lib;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Create explicit wait for admin
	public DataProviders data;																				// actions
  
	@Parameters("browser") // need to pass the browser parameter from testng.xml to specify which browser to use for testing
	//need to edit method
	@BeforeTest(groups= {"RegressionTest","SmokeTest"})
	public void OpenBrowser(String browser) throws IOException {
        if(browser.equalsIgnoreCase("chrome")) {
        	
        driver = new ChromeDriver();
        }// Launch Chrome browser
		else if (browser.equalsIgnoreCase("edge")) {
			// driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			// driver = new FirefoxDriver();
		}
        Reporter.log("enter valid browser name");
		driver = new ChromeDriver(); // Launch Chrome browser
		driver.manage().window().maximize(); // Maximize browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lib = new FileLib();
		String url = lib.readPropertyData(PROPERTIES_PATH, "url");
		driver.get(url);
		Reporter.log("Browser Opened and Navigated to URL: " + url, true);
	}

	/*
	 * @BeforeMethod(groups= {"RegressionTest","SmokeTest"}) public void
	 * login(String un,String pwd) throws IOException { loginpage = new
	 * LoginPage(driver); String username = lib.readExcelData("Login", 1, 0); String
	 * password = lib.readExcelData("Login", 1, 1);
	 * loginpage.getUserNameTextField().sendKeys(username);
	 * loginpage.getPasswordTextField().sendKeys(password);
	 * loginpage.getLoginButton().click(); Reporter.log("Logged in with username: "
	 * + username, true); }
	 * 
	 * @AfterMethod(groups= {"RegressionTest","SmokeTest"}) public void logout() {
	 * logoutpage = new LogoutPage(driver); logoutpage.getProfileMenuIcon().click();
	 * logoutpage.getLogoutOption().click(); Reporter.log("Logged out successfully",
	 * true); }
	 */

	@AfterTest(groups= {"RegressionTest","SmokeTest"})
	public void browserClose() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		Reporter.log("Browser closed successfully", true);
	}

}

