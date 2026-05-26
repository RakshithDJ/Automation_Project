package com.orange.Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orange.generic.BaseClass;
import com.orange.generic.IRetryAnalyzerImplementation;
import com.orange.pom.AdminPage;

@Listeners(com.orange.generic.ListenerImplementation.class)
public class TestScript4 extends BaseClass {

	public AdminPage admin;

	@Test(groups = "RegressionTest", retryAnalyzer = IRetryAnalyzerImplementation.class)
	public void creatAdminData() throws EncryptedDocumentException, IOException {
		admin = new AdminPage(driver);
		admin.getAdminMenu().click();
		String un = lib.readExcelData("EMPDATA", 1, 0);
		admin.getUserNameTextbox().sendKeys(un,Keys.ENTER);
		admin.getUserRoleDropDown().click();
		admin.getESSDropDownOption().click();
		String db = lib.readExcelData("EMPDATA", 1, 0);
		admin.getEmplyoeeNameTextbox().sendKeys(db, Keys.ENTER);
		admin.getRestButton().click();
		Reporter.log("Clicked on Admin TestCase Pass " + ":" + "Regression TestMethod ", true);
	}

	/*
	 * @Test(groups = "SmokeTest", retryAnalyzer =
	 * IRetryAnalyzerImplementation.class) public void creatAdminDatas() { admin =
	 * new AdminPage(driver); // admin.getAdminMenu().click();
	 * admin.getUserNameTextbox().sendKeys("Ravi M B");
	 * admin.getUserRoleDropDown().click(); admin.getESSDropDownOption().click();
	 * admin.getEmplyoeeNameTextbox().sendKeys("Ravi", Keys.ENTER);
	 * admin.getRestButton().click();
	 * Reporter.log(" Unit Regression :Clicked on Admin TestCase Pass ", true); }
	 */

}
