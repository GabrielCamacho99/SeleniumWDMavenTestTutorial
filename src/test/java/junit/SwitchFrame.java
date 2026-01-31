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


public class SwitchFrame {
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
		WebElement searchBox = driver.findElement(By.id("search"));
		searchBox.sendKeys("python");
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();
	}

	

}
