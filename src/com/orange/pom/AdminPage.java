package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement AdminMenu;

	@FindBy(xpath = "(//input[@class])[2]")
	private WebElement userNameTextbox;

	@FindBy(xpath = "(//div[text()='-- Select --'])[1]")
	private WebElement userRoleDropDown;

	@FindBy(xpath = "//span[text()='ESS']")
	private WebElement ESSdropDownOption;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement emplyoeeNameTextbox;

	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement restButton;

	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdminMenu() {
		return AdminMenu;
	}

	public WebElement getUserNameTextbox() {
		return userNameTextbox;
	}

	public WebElement getUserRoleDropDown() {
		return userRoleDropDown;
	}

	public WebElement getESSDropDownOption() {
		return ESSdropDownOption;
	}

	public WebElement getEmplyoeeNameTextbox() {
		return emplyoeeNameTextbox;
	}

	public WebElement getRestButton() {
		return restButton;
	}

}
