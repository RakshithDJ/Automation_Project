package PractiseScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 *This TestScript is about handling Popup
 *PopUp is a small window or element that will be displayed in the webpage on performing any action
 *There are diffrent types of popups[8]
 *Alert , confirmation ,prompt javascript popup
 *Hidden divison popup
 *File upload
 *File download
 *print popup
 *notification popup
 *authentication 
 *child window / browser window
 ***************************************************************************************************************
 * Alert popup 
 * we cannot impact this popup
 * we cannot move this popup
 * This popup will br present in the middle of the webpage under the URL tab.This popup is displayed we cannot perform anyaction on the webpage.
 * If this popup contains OK button (Alert PopUp).
 * If it contians OK and Cancel (Confirmation popup) 
 * If this popip contains texbox OK and Cancel (prompt popup)
 * Since all these popup are created using the javaScript language it is called as javascript popup
 * We can handle by using the swtichTo().alert();
 * swtichTo() method transfer the control from one place to another place.
 * Alert() is interface and the methods are accept(), dismiss(),getText(),SemdKeys().
 * @author rakshith.s
 ***/


public class TestScript16 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// Launches a new Chrome browser instance

		driver.manage().window().maximize();
		// Maximizes the browser window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Sets an implicit wait of 5 seconds for all element searches

		driver.get("https://demoapps.qspiders.com/");
		// Navigates to the QSpiders demo applications website

		Thread.sleep(2000);
		// Pauses execution for 2 seconds to allow page loading

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Clicks on the "UI Testing Concepts" option on the homepage

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		// Clicks on the "Popups" section under UI Testing Concepts

		Thread.sleep(2000);
		// Waits for popup-related options to load

		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		// Selects the "Javascript" popup section

		Thread.sleep(2000);
		// Gives time for JavaScript popup elements to appear

		List<WebElement> ch = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
		// Finds and stores all checkbox elements on the page into a list

		for (WebElement elements : ch) {
		    elements.click();
		    // Iterates through each checkbox in the list and selects it
		}

		driver.findElement(By.id("deleteButton")).click();
		// Clicks the delete button which triggers a JavaScript alert popup

		Thread.sleep(1000);
		// Waits for the JavaScript alert to appear

		Alert a = driver.switchTo().alert();
		// Switches control from the main page to the JavaScript alert

		String text = a.getText();
		// Retrieves the text/message displayed in the alert

		System.out.println(text);
		// Prints the alert message to the console

		a.dismiss();
		// Dismisses the alert by clicking "Cancel" (NOT OK)

		driver.quit();
		// Closes the browser and ends the WebDriver session

	}
}
