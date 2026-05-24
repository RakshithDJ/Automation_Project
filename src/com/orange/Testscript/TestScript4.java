package com.orange.Testscript;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orange.generic.BaseClass;
import com.orange.pom.AdminPage;

public class TestScript4 extends BaseClass {

	public AdminPage admin;

	@Test
	public void creatAdminData() {
		admin = new AdminPage(driver);
		admin.getAdminMenu().click();
		admin.getUserNameTextbox().sendKeys("Ravi M B");
		admin.getUserRoleDropDown().click();
		admin.getESSDropDownOption().click();
		admin.getEmplyoeeNameTextbox().sendKeys("Ravi", Keys.ENTER);
		admin.getRestButton().click();
		Reporter.log("Clicked on Admin TestCase Pass ", true);

	}

}



