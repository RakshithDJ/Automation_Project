package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
	 
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Open LG India website
		driver.get("https://www.lg.com/in/");

		// Capture the title of the current webpage
		String title = driver.getTitle();

		// Capture the current URL of the webpage
		String Url = driver.getCurrentUrl();

		// Print the current URL
		System.out.println(Url);

		// Print the title of the opened webpage
		System.out.println(title);

		// Navigate to BookMyShow website
		driver.navigate().to("https://in.bookmyshow.com/");

		// Navigate back to the previous page (LG website)
		driver.navigate().back();

		// Refresh the current page
		driver.navigate().refresh();

		// Navigate forward to BookMyShow page again
		driver.navigate().forward();	

		// Close the browser and end the WebDriver session
		driver.quit();
		
		    
	}

}
