package junit;

import java.time.Duration;
//import java.util.Set;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import usefulmethods.WaitTypes;


public class SwitchToiFrame {
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
		driver.switchTo().frame("courses-iframe");// switch to frame by id
//		driver.switchTo().frame("iframe-name");   switch to frame by name
//		driver.switchTo().frame(0);             switch to frame by number
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		searchBox.sendKeys("python");
		
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		
		driver.findElement(By.id("name")).sendKeys("Test successful");
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();
	}

	

}
