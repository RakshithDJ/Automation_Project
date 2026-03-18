package PractiseScripts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * To Check the Email password text box in the facebook Webpage are of same size and aligned properly.
 * @author rakshith.s
 ***/

public class TestScript3 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		// Locate the email input field using its 'name' attribute
		WebElement email = driver.findElement(By.name("email"));

		// Locate the password input field using its 'name' attribute
		WebElement password = driver.findElement(By.name("pass"));

		// getSize() → Returns the height and width of the element
		Dimension D = email.getSize();

		// Store the height of the email field
		int height = D.getHeight();

		// Store the width of the email field
		int width = D.getWidth();

		// Print the size (height and width) of the email input element
		System.out.println("The size of an element height is :"+height+" "+"Width :"+width);

		// getRect() → Gives both size + location (X & Y coordinates)
		int H1 = password.getRect().getHeight();   // Height of password field
		int W1 = password.getRect().getWidth();    // Width of password field

		// Print the size/location details of password element
		System.out.println("The size of an element height is :"+ H1 +" "+"Width :"+ W1);

		// getLocation() → Returns only X & Y coordinates of element
		Point P = email.getLocation();   

		int P1 = P.getX();   // X coordinate of email element
		int P2 = P.getY();   // Y coordinate of email element

		// Getting coordinates using getRect() also
		int P3 = email.getRect().getX();  
		int P4 = email.getRect().getY();

		// Print the coordinates using getLocation()
		System.out.println("The Points are :"+"P1:"+P1+" "+"P2:"+P2);

		// Print the coordinates using getRect()
		System.out.println("The Points are :"+"P3:"+P3+" "+"P4:"+P4);

		// Close the browser
		driver.quit();
	}

}
