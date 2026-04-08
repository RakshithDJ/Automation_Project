package PractiseScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/***
 * This TestScript will handle Multi select dropdown.
 * {@link TestScript13}
 * @author rakshith.s
 */

public class TestScript14 {

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
		// Clicks on the "UI Testing Concepts" section using XPath

		Thread.sleep(2000);
		// Waits for the UI Testing Concepts page to load

		driver.findElement(By.linkText("Dropdown")).click();
		// Clicks on the "Dropdown" option using link text

		driver.findElement(By.linkText("Multi Select")).click();
		// Clicks on the "Multi Select" option to open the multi-select dropdown page

		WebElement dp = driver.findElement(By.id("select-multiple-native"));
		// Locates the multi-select dropdown element using its id attribute

		Select S = new Select(dp);
		// Creates a Select class object to interact with the multi-select dropdown

		List<WebElement> o = S.getOptions();
		// Fetches all available options present inside the dropdown

		for (int i = 0; i < o.size(); i++) {
			// Loop to iterate through all dropdown options from first to last

			// S.selectByIndex(i);
			// (Commented) Alternative way to select dropdown options using index

			String options = o.get(i).getText();
			// Retrieves the visible text of the current dropdown option

			S.selectByContainsVisibleText(options);
			// Selects the dropdown option by matching its visible text

			System.out.println(o.get(i).getText());
			// Prints the selected option text to the console
		}

		for (int i = o.size() - 1; i >= 0; i--) {
			// Loop to iterate through dropdown options in reverse order

			S.deselectByIndex(i);
			// Deselects each option using its index value
		}

		System.out.println("Selcted and Deselected");
		// Prints a message indicating all options were selected and then deselected
		driver.quit();
	    
		
	}
}



