package com.orange.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	
	@FindBy(xpath ="(//i[@class])[4]")
	private WebElement profileMenuIcon;
	
	@FindBy(linkText ="Logout")
	private WebElement logoutOption ;
	
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProfileMenuIcon() {
		return profileMenuIcon;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}

	public void clickProfileMenu(WebDriver driver) {
	    WebDriverWait wait =
	        new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(profileMenuIcon)).click();
	}
	
}
