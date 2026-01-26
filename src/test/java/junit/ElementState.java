package junit;


import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementState {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.google.com";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		
	}
	
	@Test
	public void test() {
		driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']")).click();
		WebElement e1 = driver.findElement(By.id("APjFqb"));
		System.out.println("E1 is Enabled? " + e1.isEnabled());
		
/*		This could be necessary if there were 3 elements for the search bar 
		with 1 enabled and 2 disabled to know which one to use but , 
		in this case there is only 1 element for the search bar
		WebElement e2 = driver.findElement(By.id("APjFqb"));
		System.out.println("E1 is Enabled? " + e2.isEnabled());
		
		WebElement e3 = driver.findElement(By.id("APjFqb"));
		System.out.println("E1 is Enabled? " + e3.isEnabled());
*/
		e1.sendKeys("letskodeit");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

	
}
