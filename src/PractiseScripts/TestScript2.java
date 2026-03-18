package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript2 {

	public static void main(String[] args) throws InterruptedException {
	
		// Launches a new Chrome browser window
		WebDriver driver = new ChromeDriver();

		// Maximizes the browser window
		driver.manage().window().maximize();

		// Sets an implicit wait of 5 seconds for all elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Opens the Facebook login page
		driver.get("https://www.facebook.com/");

		// Enters the email/phone number into the email field
		driver.findElement(By.name("email")).sendKeys("9874563216");

		// Pauses execution for 2 seconds
		Thread.sleep(2000);

		// Enters the password into the password field
		driver.findElement(By.name("pass")).sendKeys("orange@gmail.com");

		// Pauses execution for 2 seconds
		Thread.sleep(2000);

		// Locates the email input element and stores it in a WebElement reference
		WebElement email = driver.findElement(By.name("email"));

		// Clears the text inside the email input field
		email.clear();

		// Gets the HTML tag name of the email element (e.g., "input")
		String TagName = email.getTagName();

		// Prints the tag name to the console
		System.out.println(TagName);

		// Prints visible text of the email element (input fields usually return empty)
		System.out.println(email.getText());

		// Prints the value of the "name" attribute of the email element
		System.out.println(email.getAttribute("autocomplete"));
		
		driver.quit();
	}

}
