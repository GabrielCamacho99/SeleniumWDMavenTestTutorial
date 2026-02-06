package keypress;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressDemo1 {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.letskodeit.com/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
	}

	
	@Test
	public void testKeyPress() throws Exception {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
//		driver.findElement(By.id("login-password")).sendKeys("test123test");
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//button[@id='login']")).sendKeys(Keys.ENTER);
		
	}

	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}


}
