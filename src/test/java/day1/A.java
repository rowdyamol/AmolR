package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	WebDriver driver;
	@Test
	public void testMethod() {
		
		System.out.println("Test method executed");
	}
	
	
	@Test
	public void verifyTitle() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		Assert.assertEquals(title, "Register");
		System.out.println("Verify title method executed");
		driver.quit();
		
	}
}
