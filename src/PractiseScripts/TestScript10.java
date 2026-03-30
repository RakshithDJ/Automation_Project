package PractiseScripts;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * Open QSP app ->UI Tetsing-->checkbox-->Select 10 checkbox
 * {@link TestScript9}
 * @author rakshith.s 
 */

public class TestScript10 {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		// Clicks on the link that partially matches the text "UI Testing"
		driver.findElement(By.partialLinkText("UI Testing")).click();

		// Pauses the execution for 2 seconds to wait for the page to load
		Thread.sleep(2000);

		// Clicks on the link with the exact text "Check Box"
		driver.findElement(By.linkText("Check Box")).click();

		// Pauses the execution for 2 seconds to allow checkbox page to load
		Thread.sleep(2000);

		// Finds all checkbox input elements present on the page
		List<WebElement> CB = driver.findElements(By.xpath("//input[@type='checkbox']"));

		// Stores the total number of checkboxes found
		int count = CB.size(); 

		// Loop to iterate through each checkbox
		for(int i=0;i<count;i++)
		{
		   // Retrieves the checkbox element at the current index
		   WebElement ck = CB.get(i);
		   
		   // Clicks on the checkbox
		   ck.click();
		   
		   // Checks whether the checkbox is selected or not
		   Boolean clicked = ck.isSelected();
		   
		   // Prints the selection status of the checkbox
		   System.out.println(clicked);
		}

		// Closes the browser and ends the WebDriver session
		driver.quit();
  }
	
}
