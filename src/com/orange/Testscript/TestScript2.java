package com.orange.Testscript;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

/***
 *@author rakshith.s
 */

public class TestScript2 {

    static WebDriver driver; // Declare a static WebDriver instance to be shared across all test methods
    
    @Test(priority = 0)
    public void OpenBrowser() {
        driver = new ChromeDriver(); // Launch a new Chrome browser instance
        driver.manage().window().maximize(); // Maximize the browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Set implicit wait of 15 seconds
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Navigate to OrangeHRM login page
        Reporter.log("Test Case Pass ",true);
    }
    
    @Test(priority = 1, dependsOnMethods = "OpenBrowser")
    public void login() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Create explicit wait with 15 seconds timeout
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("Admin"); // Enter username
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("admin123"); // Enter password
        Thread.sleep(2000); // Pause execution for 2 seconds
        driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login button
        Reporter.log("Test Case Pass ",true);
    }
    
    @Test(priority = 2, dependsOnMethods = "login")
    public void admin() {        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Create explicit wait for admin actions
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']"))).click(); // Click on Admin menu
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class])[1]"))).sendKeys("Ravi M B"); // Enter employee name
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='-- Select --'])[1]"))).click(); // Click on User Role dropdown
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ESS']"))).click(); // Select ESS role
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type for hints...']"))).sendKeys("Ravi M B"); // Enter employee name in hints field
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Reset ']"))).click(); // Click on Reset button
        Reporter.log("Test Case Pass ",true);
    }
    
    @Test(priority = 3, dependsOnMethods = "admin")
    public void logout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25)); // Create explicit wait with longer timeout for logout
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class])[4]"))).click(); // Click on user profile/menu icon
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout"))).click(); // Click on Logout option
        Reporter.log("Test Case Pass ",true);
    }
    
    @Test(priority = 4, invocationCount = 1, enabled = true)
    public void closeBrowser() {
        driver.quit(); // Close all browser windows and end WebDriver session
        Reporter.log("TestScript2 Pass"); // Log test execution status in TestNG report
    }
}
