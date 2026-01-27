package junit;



import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CalendarSelection {
	private WebDriver driver;
	private String baseURL;
	

	@Before
	public void setUp() throws Exception {
		//Open and setup test object
		driver = new FirefoxDriver();
		baseURL = "https://euro.expedia.net/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	public void test() throws Exception {
		//Given		The user is on the Flights tab from the baseURL
		driver.get(baseURL);		
		driver.findElement(By.linkText("Flights")).click();		
		WebElement departingField = driver.findElement(By.id("d1-btn"));
		departingField.click();
		
		
		//When 		The user fills the flight filters
		WebElement dateStart = driver.findElement(By.cssSelector("button[aria-label='1 Feb 2026']"));
		dateStart.click();
		WebElement dateEnd = driver.findElement(By.cssSelector("button[aria-label='15 Feb 2026']"));
		dateEnd.click();
		WebElement doneBtn = driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']"));
		doneBtn.click();
		
		//And		Clicks Search
		WebElement searchBtn = driver.findElement(By.xpath("//button[@data-testid='submit-button']"));
		searchBtn.click();
		
		
	}

	@After
	public void tearDown() throws Exception {
		//Then	The user observes final results and closes test object
		Thread.sleep(10000);
		driver.quit();
	}



}
