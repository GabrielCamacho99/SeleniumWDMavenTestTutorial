package junit;




import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementDisplayed {
	WebDriver driver;
	String baseURL1;
	String baseURL2;
	

	@Before
	public void setUp() throws Exception {
		//Open and setup test object
		driver = new FirefoxDriver();
		baseURL1 = "https://www.letskodeit.com/practice";
		baseURL2 = "https://www.expedia.com";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		
	}

	@Test
	public void test1() throws InterruptedException {
		driver.get(baseURL1);
		
		//This test passes because element is only hidden not destroyed
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked on hide button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("Clicked on show button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.get(baseURL2);
		
		//This test is meant to fail, the element is not only hidden , it is destroyed when it is not displayed
		WebElement childCalendar = driver.findElement(By.cssSelector("div[class='uitk-date-display selection-filled selected']"));
		System.out.println("Text Box Displayed: " + childCalendar.isDisplayed());
	}
	
	@After
	public void tearDown() throws Exception {
		//observe final results and close test object
		Thread.sleep(2000);
		driver.quit();
	}

	

}
