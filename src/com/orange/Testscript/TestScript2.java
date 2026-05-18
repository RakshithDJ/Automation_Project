package com.orange.Testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 {

    static	WebDriver driver;
	

	@Test(priority = 0)
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 1, dependsOnMethods = "OpenBrowser")
	public void login() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("Admin");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority = 2,dependsOnMethods="login")
	public void admin() 
	{		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class])[1]"))).sendKeys("Ravi M B");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='-- Select --'])[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ESS']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type for hints...']"))).sendKeys("Ravi M B");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Reset ']"))).click();
	}
	

	@Test(priority =3 , dependsOnMethods = "admin")
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class])[4]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout"))).click();

	}
	
	
	@Test(priority = 4, invocationCount = 1, enabled = true)
	public void closeBrowser() {
		driver.quit();
		Reporter.log("TestScript2 Pass");
	}
}
