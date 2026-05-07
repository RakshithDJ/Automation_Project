package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * This class demonstrates various WebDriver operations such as navigating to URLs, managing browser windows, handling cookies, and verifying page titles using Selenium WebDriver with ChromeDriver.
 *@author rakshith.s
 */
public class TS_1 {

 public static void main(String[] args) throws InterruptedException {

  // Initialize ChromeDriver instance
  WebDriver driver = new ChromeDriver();
  // Maximize the browser window
  driver.manage().window().maximize();
  // Navigate to the contact page
  driver.get("http://mail.jspiders.com/contact-0");
  // Navigate to the demo apps page
  driver.navigate().to("https://demoapps.qspiders.com/");
  // Go back to the previous page
  driver.navigate().back();
  // Go forward to the next page
  driver.navigate().forward();
  // Refresh the current page
  driver.navigate().refresh();
  // Wait for 2 seconds
  Thread.sleep(2000);
  // Get the current URL
  String currentUrl = driver.getCurrentUrl();
  // Print the current URL to console
  System.out.println("Current URL: " + currentUrl);
  // Delete all cookies
  driver.manage().deleteAllCookies();
  // Print confirmation message after deleting cookies
  System.out.println("All cookies deleted");
  // Define the expected page title
  String Expected_Title = "DemoApps | Qspiders";
  // Get the actual title from the current page
  String Actual_Title = driver.getTitle();
  // Compare expected and actual titles
  if (Expected_Title.equals(Actual_Title)) {
   // Print success message if titles match
   System.out.println("Title is Matching");
  } else {
   // Print failure message if titles don't match
   System.out.println("Title is not Matching");
  }
  // Print the expected title to console
  System.out.println("Expected Title: " + Expected_Title);
  // Print the actual title to console
  System.out.println("Actual Title: " + Actual_Title);
  // Retrieve the page source code
  String source = driver.getPageSource();
  // Print the page source to console
  System.out.println("Page Source :-"+source);
  // Set the browser window size to 250x450 pixels
  driver.manage().window().setSize(new Dimension(250,450));
  // Minimize the browser window
  driver.manage().window().minimize();
  // Close the browser and end the session
  driver.quit();

 }

}

