package junit;

import java.time.Duration;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import usefulmethods.WaitTypes;


public class SwitchWindow {
	private WebDriver driver;
	private String baseURL;
	WaitTypes wt;
	JavascriptExecutor js;
	

	@Before
	public void setUp() throws Exception {
		//Open and setup test object
		driver = new ChromeDriver();
		baseURL = "https://www.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wt = new WaitTypes(driver);
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	
	@Test
	public void test() throws Exception {
		
		//Get the handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Handle: " + parentHandle);
		
		
		//Find Open Window button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		
		
		//Get all handles
		Set<String> handles = driver.getWindowHandles();
		
		 
		//Switching between handles
		for (String handle: handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);				
				wt.clickWhenReady(By.id("search"), 5);
				WebElement searchBox = driver.findElement(By.id("search"));
				js.executeScript(
					    "arguments[0].focus();" +
					    "arguments[0].value = arguments[1];" +
					    "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
					    "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
					    searchBox,
					    "python"
				);

				
				
				Assert.assertEquals("python", searchBox.getAttribute("value"));

				break;
				
			}
			/*
			 * Not working as expected, test passes but input is never achieved.
			 */
		}
		
		//Switch back to the parent window
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name"));
		
		
		
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();
	}

	

}
