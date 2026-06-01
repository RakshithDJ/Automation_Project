package PractiseScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript33 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.switchTo().frame("app");
		Actions ac = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='Forms']"));
		ac.scrollToElement(element).perform();
		element.click();
		driver.quit();

	}

}
