package usefulmethods;



import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethodsDemo {
	private WebDriver driver;
	private String baseURL;
	private GenericMethods gm;
	
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		gm = new GenericMethods(driver);
		
	}

	@Test
	public void test1() throws Exception  {
		driver.get(baseURL);
		
		WebElement element = gm.getElement("name", "id");
		element.sendKeys("test");
		
	}
	
	@Test
	public void test2() throws Exception  {
		driver.get(baseURL);
		
		
		
		List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
		
		int size = elementList.size();
		System.out.println("Size of the element list is: " + size);
		
		
		
	}
	
	@Test
	public void test3() throws Exception  {
		driver.get(baseURL);
		
		boolean result1 = gm.isElementPresent("name", "id");
		System.out.println("Element is present: " + result1);
		
		boolean result2 = gm.isElementPresent("name-not-present", "id");
		System.out.println("Element is present: " + result2);
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}
