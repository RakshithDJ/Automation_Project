package com.orange.Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orange.generic.BaseClass;
import com.orange.pom.AdminPage;
import com.orange.pom.LoginPage;
import com.orange.pom.LogoutPage;
import com.orange.pom.PIMPage;

@Listeners(com.orange.generic.ListenerImplementation.class)
public class TestScript4 extends BaseClass {

	public AdminPage admin;
	public LoginPage loginpage;
	public LogoutPage logout;
	public PIMPage pim;

	@Test(priority = 1, dataProvider = "login", dataProviderClass = com.orange.generic.DataProviders.class, groups = {
			"RegressionTest", "SmokeTest" })
	public void login(String un, String pwd) {
		loginpage = new LoginPage(driver);
		loginpage.getUserNameTextField().sendKeys(un);
		loginpage.getPasswordTextField().sendKeys(pwd);
		loginpage.getLoginButton().click();
	}

	@Test(groups = "RegressionTest", priority = 2)
	public void verifiyTitle() {
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle); // Soft assertion to compare actual and expected titles
		s.assertAll(); // Collate and report all assertion results
		Reporter.log("Title Verified Successfull", true); // Log test execution status in TestNG report
	}

	@Test(priority = 3, groups = "RegressionTest")
	public void creatAdminData() throws EncryptedDocumentException, IOException {
		admin = new AdminPage(driver);
		admin.getAdminMenu().click();
		String un = lib.readExcelData("Login", 1, 0);
		admin.getUserNameTextbox().sendKeys(un, Keys.ENTER);
		admin.getUserRoleDropDown().click();
		admin.getESSDropDownOption().click();
		String db = lib.readExcelData("Login", 1, 0);
		admin.getEmplyoeeNameTextbox().sendKeys(db, Keys.ENTER);
		admin.getRestButton().click();
		Reporter.log("Clicked on Admin TestCase Pass " + ":" + "Regression TestMethod ", true);
	}

	@Test(priority = 4)
	public void logout() {
		logoutpage = new LogoutPage(driver);
		logoutpage.getProfileMenuIcon().click();
		logoutpage.getLogoutOption().click();
		Reporter.log("Logged out successfully", true);
	}

}
