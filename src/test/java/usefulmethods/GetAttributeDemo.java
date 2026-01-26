package usefulmethods;



import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeDemo {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}

	@Test
	public void test() throws Exception  {
		driver.get(baseURL);
		
		WebElement element = driver.findElement(By.id("name"));
		String attributeValue = element.getAttribute("class");
		
		
		System.out.println("Value of the attribute is: " + attributeValue);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
