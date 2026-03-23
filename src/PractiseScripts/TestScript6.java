package PractiseScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***Open the browser trigger facebook and Refresh the webpage
 * Get the TagName ,href value and font-wieght
 * create page link ,find the element using Xpath by partial attribute
 * Get the color and check forgotten password link is enabled and not displayed 
 * Click on create new account button ,Enter the first name and copy paste into password text box
 * check for first Name and Surname text box are of same size or not
 * check all three radio button are aligned properly or not and select male and female button
 * click on signup using submit and close the button.
 * @Author Rakshith
 ***/


public class TestScript6 {

	public static void main(String[] args) {
		
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.facebook.com/");
    driver.navigate().refresh();
    String S =driver.findElement(By.xpath("//input[@name='email']")).getTagName();
    System.out.println(S);
    String D = driver.findElement(By.xpath("//a[text()='Create Page']")).getAttribute("href");
    System.out.println(D);
    String G =driver.findElement(By.xpath("//div[@role=\"button\"]")).getCssValue("color");
    System.out.println(G);
 
    driver.quit();
		
		
	}

}
