package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * Open the browser trigger facebook and Refresh the webpage Get the TagName
 * ,href value and font-wieght create page link ,find the element using xpath by
 * partial attribute Get the color and check forgotten password link is enabled
 * and not displayed Click on create new account button ,Enter the first name
 * and copy paste into password text box check for first Name and Surname text
 * box are of same size or not click on signup using submit and close the button.
 * @Author Rakshith
 ***/

public class TestScript6 {

	public static void main(String[] args) {

		// Launches the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximizes the browser window
		driver.manage().window().maximize();

		// Applies implicit wait of 5 seconds for element loading
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Opens the Facebook website
		driver.get("https://www.facebook.com/");

		// Refreshes the current webpage
		driver.navigate().refresh();

		// Fetches the tag name of the email input field
		String TagName = driver.findElement(By.xpath("//input[@name='email']")).getTagName();
		System.out.println("TagName:" + TagName);

		// Fetches the href attribute value of the "Create Page" link
		String Value = driver.findElement(By.xpath("//a[text()='Create Page']")).getAttribute("href");
		System.out.println("Value:" + Value);

		// Fetches the font-weight CSS property of the "Log in to" text
		String font_weight = driver.findElement(By.xpath("//span[contains(text(),'Log in to')]"))
				.getCssValue("font-weight");
		System.out.println("font-weight :" + font_weight);

		// Fetches the color CSS property of the login button
		String color = driver.findElement(By.xpath("//div[@role=\"button\"]")).getCssValue("color");
		System.out.println("color:" + color);

		// Fetches the visible text of a link containing the word "Page"
		String Link_Text = driver.findElement(By.xpath("//a[contains(text(),'Page')]")).getText();
		System.out.println("Link_Text_color:" + Link_Text);

		// Checks whether the "Forgotten password?" link is enabled
		Boolean Link_Enabled = driver.findElement(By.xpath("//span[text()='Forgotten password?']")).isEnabled();

		// Prints link enabled status
		if (Link_Enabled == true) {
			System.out.println("Link_Enabled:" + Link_Enabled);
		} else {
			System.out.println("Link is disabled");
		}

		// Clicks on "Create new" account option
		driver.findElement(By.xpath("//span[contains(text(),'Create new')]")).click();

		// Enters text in first name field and copies it using keyboard shortcut
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("Hello" + Keys.CONTROL + "AC");

		// Pastes the copied text into surname field
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys(Keys.CONTROL + "V");

		// Locates the First Name input field
		WebElement FirstName = driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));

		// Locates the Surname input field
		WebElement Surname = driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));

		// Gets the size (height & width) of First Name field
		Dimension FNSize = FirstName.getSize();
		int FNH = FNSize.getHeight();
		int FNW = FNSize.getWidth();

		// Gets the size (height & width) of Surname field
		Dimension SN = Surname.getSize();
		int SNH = SN.getHeight();
		int SNW = SN.getWidth();

		// Compares height and width of both input fields
		if (FNH == SNH && FNW == SNW) {
			System.out.println("The both firstName and Surname sizes are same:");
			System.out.println("The sizes are:" + "Height:" + FNH + ":+" + SNH + ":" + FNW + ":" + SNW);
		} else {
			System.out.println("The both sizes are not same");
			System.out.println(
					"The different sizes are:" + "Height and width:" + FNH + ":+" + SNH + ":" + FNW + ":" + SNW);
		}

		// Clicks on the signup/register button
		driver.findElement(By.xpath("(//div[@role='button'])[4]")).click();

		// Confirmation message after automation
		System.out.println("FaceBook Automated");

		// Closes the browser
		driver.quit();
		
	}

}
