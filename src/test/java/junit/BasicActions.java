package junit;



import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicActions {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.letskodeit.com/home";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.xpath("//div[@class='navbars header-logo header-style']//a[@href='/login']")).click();
		System.out.println("clicked on Sign In");
		driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']")).sendKeys("gabriel31299@gmail.com");
		System.out.println("sendind keys to username field");
		driver.findElement(By.id("login-password")).sendKeys("testpass123");
		System.out.println("sendind keys to password field");
		driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']")).clear();
		System.out.println("Clearing the username field");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
