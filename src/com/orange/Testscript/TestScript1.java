package com.orange.Testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestScript1 {

    static WebDriver driver; // Declare a static WebDriver instance to be shared across test methods

    @Test(priority = 0)
    public void OpenBrowser() {
        driver = new ChromeDriver(); // Launch Chrome browser
        driver.manage().window().maximize(); // Maximize browser window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Open OrangeHRM login page
        Reporter.log("Test Case Pass ",true);
    }

    @Test(priority = 1, dependsOnMethods = "OpenBrowser")
    public void login() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Create explicit wait with 15 seconds timeout
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("Admin"); // Enter username
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("admin123"); // Enter password
        Thread.sleep(2000); // Pause execution for 2 seconds
        driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click Login button
        Reporter.log("Test Case Pass ",true);
    }

    @Test(priority = 2, dependsOnMethods = "login", timeOut = 10)
    public void logout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25)); // Create explicit wait for logout actions
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class])[4]"))).click(); // Click user/profile menu icon
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout"))).click(); // Click Logout option
        Reporter.log("Test Case Pass ",true);
    }

    @Test(priority = 3, invocationCount = 1, enabled = true)
    public void closeBrowser() {

        // driver.quit(); // Code to close browser (currently commented, so browser will not close)
        throw new SkipException("Skip"); // Explicitly skip this test using TestNG SkipException
        // Assert.fail(); // Code to force test failure (currently commented)
      
    }
}



