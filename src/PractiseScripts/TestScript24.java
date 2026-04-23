package PractiseScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


/***
 * This Script handles Mouse Actions
 * In order to perform mouse actions in selenium we make use of non static method from Action class
 * Actions class constructor will take webdriver as parameter.
 * In order to perform any actions we use perform() at last.
 * All methods in action class are example of method overloading.
 * They will return type of reference due to which we can acheive the method chaining.
 * @author rakshith.s
 ***/

public class TestScript24 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		// Creates a ChromeOptions object to customize Chrome browser behavior

		options.addArguments("--disable-notifications", "--start-maximized");
		// Disables browser notifications and launches the browser in maximized mode

		WebDriver driver = new ChromeDriver(options);
		// Starts a new Chrome browser session using the specified ChromeOptions

		// driver.manage().window().maximize();
		// Optional window maximize method; not required because --start-maximized is already used

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Sets an implicit wait of 5 seconds for all element lookups

		driver.get("https://demoapps.qspiders.com");
		// Opens the QSpiders demo application in the browser

		Thread.sleep(2000);
		// Hard wait of 2 seconds to allow the page to load fully

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		// Clicks on the "UI Testing Concepts" option on the home page

		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		// Navigates to the "Mouse Actions" section under UI Testing Concepts

		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		// Opens the "Drag & Drop" functionality page

		WebElement d = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		// Locates the draggable element labeled "Drag Me"

		Actions a = new Actions(driver);
		// Creates an Actions class object to perform advanced mouse operations

		a.clickAndHold(d).dragAndDropBy(d, 216, -91).perform();
		// Clicks and holds the draggable element, then moves it by the given X and Y offset values

		Thread.sleep(2000);
		// Waits for 2 seconds to visually observe the drag-and-drop action result

	    driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
	    
        WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
        WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
        
        WebElement mobilebox = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		a.dragAndDrop(mobileCharger, mobilebox).perform();
		a.dragAndDrop(mobileCover, mobilebox).perform();
		
		WebElement LaptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	    WebElement LaptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	    WebElement LaptopBox = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	    a.dragAndDrop(LaptopCharger, LaptopBox).perform();
		a.dragAndDrop(LaptopCover, LaptopBox).perform();
		
		
	    driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();
		
		   List<WebElement> ele = driver.findElements(By.className("draggable-elemment"));
		   WebElement mb = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		   WebElement lp = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		   int count = ele.size();
		   System.out.println("Size:"+count);
		   
		   for(WebElement tx:ele)
		   {
			
		  if((tx.getText().contains("Mobile")) &&(tx.getText().contains("Laptop")))
		     {
				Thread.sleep(2000);
				tx.click();
              	
			 }
			WebElement g = driver.findElement(By.id("dragElement1")); 
		//	WebElement h = driver.findElement(By.id("dragElement")); 
            a.clickAndHold(g).moveToElement(mb).release().perform();
            Thread.sleep(2000);
      ///      a.clickAndHold(h).moveToElement(lp).release().perform();
		    }
		
     
	    
	} 
	
}
