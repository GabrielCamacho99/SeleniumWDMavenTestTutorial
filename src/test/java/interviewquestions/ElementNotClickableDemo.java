package interviewquestions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementNotClickableDemo {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.freecrm.com/index.html";
		
/* this website is no longer presented as it was at the time
   of the tutorial, this junit file may be deprected, 
   but serves only as an example */		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	
	@Test
	public void test() throws Exception {
		driver.findElement(By.xpath("//a[@href=\"https://ui.freecrm.com?lang=pt']")).click();
		Thread.sleep(3000);
//		JavascriptExecutor js =  (JavascriptExecutor) driver;
		driver.findElement(By.name("username")).sendKeys("testing");
//		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
//		loginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//		WebElement loginButton = wait.until(
//				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
//		loginButton.click();
		
		boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		if (invisible) {
			WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
			loginButton.click();
		}
		
//		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
//		js.executeScript("arguments[0].click();", loginButton );
		
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
