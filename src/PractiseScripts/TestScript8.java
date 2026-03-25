package PractiseScripts;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * Open Google and click on search bar Type Java and Print Autosuggestion listed.
 * {@link TestScript7}
 * @author rakshith.s
 */

public class TestScript8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Open Google homepage
		driver.get("https://www.google.com/");

		// Locate the Google search box using 'name' locator and type "Java"
		driver.findElement(By.name("q")).sendKeys("Java");

		// Capture all auto‑suggestions that contain the text 'java'
		List<WebElement> suggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));

		// Wait for suggestions to load
		Thread.sleep(2000);

		// Get total number of auto‑suggestions
		int count = suggestion.size();

		// Loop through each suggestion and print its text
		for(int i = 0; i < count; i++)
		{
		    WebElement S = suggestion.get(i);
		    System.out.println(S.getText());   // Print each suggestion
		}

		// Print total count of suggestions
		System.out.println("The count of Autosuggetsion :" + count);

		// Close the browser
		driver.quit();
		
		
	}
	
}
