package usefulmethods;



import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	private WebDriver driver;
	private String baseURL;
	WaitTypes wt;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.letskodeit.com/practice";
		wt = new WaitTypes(driver);
		driver.manage().window().maximize();
		 
	}

	
	@Test
	public void testNoUtility() {
		driver.get(baseURL);
		WebElement loginLink = driver.findElement(By.linkText("SIGN IN"));
		loginLink.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement emailField = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='email'])[1]")));
						
		
		emailField.sendKeys("test");

	}
	
	@Test
	public void testWithUtility1() {
		driver.get(baseURL);
		WebElement loginLink = driver.findElement(By.linkText("SIGN IN"));
		loginLink.click();
		
		
		WebElement emailField = wt.waitForElement(By.xpath("(//input[@type='email'])[1]"), 3);
		emailField.sendKeys("test");

	}
	
	@Test
	public void testWithUtility2() {
		driver.get(baseURL);
		WebElement loginLink = driver.findElement(By.linkText("SIGN IN"));
		loginLink.click();
		
		
		WebElement emailField = wt.waitForElement(By.xpath("(//input[@type='email'])[1]"), 3);
		emailField.sendKeys("test");
		
		wt.clickWhenReady(By.id("login"), 3);

	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
