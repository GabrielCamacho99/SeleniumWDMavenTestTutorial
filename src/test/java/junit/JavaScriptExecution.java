package junit;



import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {
	private WebDriver driver;
	String baseURL;
	private JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.letskodeit.com/practice";
		js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	
	@Test
	public void testJSExe() throws Exception {
		js.executeScript("window.location = 'https://www.letskodeit.com/practice';");
		
		WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
		textBox.sendKeys("test");
		
		//size of the window
//		long height = (Long) js.executeAsyncScript("return window.innerHeight;");
//		long width = (Long) js.executeAsyncScript("return window.innerWidth;");
//		
//		System.out.println("Height is: " + height);
//		System.out.println("Width is: " + width);
		
	}
	
	@Test
	public void testJSClick1() throws Exception {
		js.executeScript("window.location = 'https://www.letskodeit.com/practice';");
		Thread.sleep(3000);
		
		WebElement checkBox = driver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0].click();", checkBox);
		
		
	}
	
/*	@Test this test is not possible due to website updates, 
	but serves as an example of how to use js click action instead of slnWd for elements that appear as not intractable. 
	public void testJSClick2() throws Exception {
		js.executeScript("window.location = 'https://www.retailmenot.com/';");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(3000);
		
		
		
		WebElement checkBoxElement = driver.findElement(By.id("subscribe"));
		System.out.println("Displayed: " + checkBoxElement.isDisplayed());
		System.out.println("Selected: " + checkBoxElement.isSelected());
	
		checkBoxElement.click();
		
		js.executeScript("arguments[0].click();", checkBoxElement);
		
		
	}*/
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
