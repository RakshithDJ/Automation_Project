package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.generic.BaseClass;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimTab;

	@FindBy(linkText = "Add Employee")
	private WebElement addEmployeeTab;

	@FindBy(name = "firstName")
	private WebElement firstNameTextField;

	@FindBy(name = "middleName")
	private WebElement middleNameTextField;

	@FindBy(name = "lastName")
	private WebElement lastNameTextField;

	@FindBy(xpath = "(//input[@class])[6]")
	private WebElement employeeIdTextField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

	
	public PIMPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
	public WebElement getPimTab() {
		return pimTab;
	}

	public WebElement getAddEmployeeTab() {
		return addEmployeeTab;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getMiddleNameTextField() {
		return middleNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmployeeIdTextField() {
		return employeeIdTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
