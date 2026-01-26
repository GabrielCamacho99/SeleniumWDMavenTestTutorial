package junit;



import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class MultipleSelect {
	private WebDriver driver;
	private String baseURL;
	
	@Before
	public void setUp() throws Exception {
		//Open and setup test object
		driver = new FirefoxDriver();
		baseURL = "https://www.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	@Test
	public void test() throws Exception {
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		System.out.println("Select orange by value");
		sel.selectByValue("orange");
		
		Thread.sleep(2000);
		System.out.println("De-select orange by value");
		sel.deselectByValue("orange");
		
		Thread.sleep(2000);
		System.out.println("Select peach by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select Apple by visible text");
		sel.selectByVisibleText("Apple");
		
		Thread.sleep(2000);
		System.out.println("Print all selected options");
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		
		
		Thread.sleep(2000);
		System.out.println("De-select all selected options");
		sel.deselectAll();
	}
	
	@After
	public void tearDown() throws Exception {
		//observe final results and close test object
		Thread.sleep(2000);
		driver.quit();	
	}

	

}
