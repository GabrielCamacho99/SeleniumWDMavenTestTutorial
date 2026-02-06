package interviewquestions;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoSuchElementDemo {
	private WebDriver driver;
	private String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://learn.letskodeit.com";
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
		
	}
	
	@Test
	public void test() {
	// 1. Timing Issues
	driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
	//WebElement emailField = driver.findElement(By.id("user_email"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	WebElement emailField = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
	emailField.sendKeys("testing");
	
	// 2. Incorrect locator or type of locator
	driver.findElement(By.xpath("//a[contains(@href,'/sign_in')]")).click();
	
	// 3. Element is in iFrame
	driver.get("https://learn.letskodeit.com/p/practice");
	driver.switchTo().frame("courses-iframe");
	driver.findElement(By.id("search-courses")).sendKeys("Java");
	driver.switchTo().defaultContent();
	
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
