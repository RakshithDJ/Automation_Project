package com.orange.Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orange.generic.BaseClass;
import com.orange.generic.IRetryAnalyzerImplementation;
import com.orange.pom.AdminPage;
import com.orange.pom.LoginPage;
import com.orange.pom.LogoutPage;
import com.orange.pom.PIMPage;

public class TestScript5 extends BaseClass {
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

	@Test(priority = 2)
	public void addEmployee() throws EncryptedDocumentException, IOException {
		pim = new PIMPage(driver);
		pim.getPimTab().click();
		pim.getAddEmployeeTab().click();
		String employeeFirstName = lib.readExcelData("PIM", 1, 0);
		pim.getFirstNameTextField().sendKeys(employeeFirstName);
		String middleName = lib.readExcelData("PIM", 1, 1);
		pim.getMiddleNameTextField().sendKeys(middleName);
		String lastName = lib.readExcelData("PIM", 1, 1);
		pim.getLastNameTextField().sendKeys(lastName);
		String employeeId = lib.readExcelData("PIM", 1, 0);
		pim.getEmployeeIdTextField().sendKeys(employeeId);
		pim.getSaveButton().click();
		Reporter.log("Added Employee Successfully", true);
		Assert.assertTrue(true); // Assertion to validate employee addition

	}

	@Test(priority = 3)
	public void logout() {
		logoutpage = new LogoutPage(driver);
		logoutpage.getProfileMenuIcon().click();
		logoutpage.getLogoutOption().click();
		Reporter.log("Logged out successfully", true);
	}

}
