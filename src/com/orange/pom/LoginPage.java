package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orange.generic.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "username")
	private WebElement userNameTextField;

	@FindBy(name = "password")
	private WebElement passwordNameTextField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordNameTextField() {
		return passwordNameTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
