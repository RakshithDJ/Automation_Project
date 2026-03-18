package Generic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome browser using ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Access browser management options
		Options opt = driver.manage();

		// Access window control functions
		Window win = opt.window();

		// Maximize the browser window (first time)
		win.maximize();

		// Maximize the browser window (second way)
		driver.manage().window().maximize();

		// Open the LG India website
		driver.get("https://www.lg.com/in/");

		// Wait for 2 seconds to let page load
		Thread.sleep(2000);

		// Delete all cookies from browser
		driver.manage().deleteAllCookies();

		// Wait for 2 seconds after deleting cookies
		Thread.sleep(2000);

		// Set window to full-screen mode
		driver.manage().window().fullscreen();

		// Wait for 2 seconds
		Thread.sleep(2000);

		// Resize browser window to width=200 and height=100 pixels
		driver.manage().window().setSize(new Dimension(200, 100));

		// Wait for 2 seconds to observe size change
		Thread.sleep(2000);

		// Move browser window to screen position x=100, y=200
		driver.manage().window().setPosition(new Point(100, 200));

		// Wait for 2 seconds to observe position change
		Thread.sleep(2000);

		// Minimize the browser window
		driver.manage().window().minimize();

		Thread.sleep(2000);
		driver.quit();

	}

}
