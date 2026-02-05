package junit;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.manage().window().maximize();
		driver.get(baseURL);
		
	}

	
	@Test
	public void test1() throws Exception {
		driver.findElement(By.id("name")).sendKeys("Gabriel");;
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	@Test
	public void test2() throws Exception {
		driver.findElement(By.id("name")).sendKeys("Gabriel");;
		driver.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
//		alert.dismiss();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
