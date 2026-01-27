package junit;



import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AutocompleteDemo {
	private WebDriver driver;
	private String baseURL;
	

	@Before
	public void setUp() throws Exception {
		//Open and setup test object
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();
		baseURL = "https://www.booking.com/flights/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(baseURL);
		
			
	}
	
	/*
	 * Tested on Firefox
	 * after several different locator attempts always failing
	 *  
	 * Tested on Chrome without changing code
	 * Test passed at first time.
	 * 
	 * This was attempted after checking inconsistency between HTML from Ff and Ch
	 * Locators may be now confuse or too long , but it was due to several attempts at Firefox
	 * And lost patience to refactor, it works i will not break it for now.
	 */
	@Test
	public void test() throws Exception {
		String partialText = "Lis";
		String textToSelect = "Humberto Delgado Airport";
		
		WebElement leavingBtn = driver.findElement(By.xpath("//div[@class='ShellButton-module__inner___ruIE+']//span[contains(text(), 'Leaving from')]"));
		leavingBtn.click();
		Thread.sleep(2000);
		
		WebElement textField = driver.findElement(By.cssSelector("input[class='AutoComplete-module__textInput___Qh3I- '"));
		textField.click();
		textField.sendKeys(partialText);
		
		WebElement ulElement = driver.findElement(By.id("flights-searchbox_suggestions"));
		
		String innerHTML = ulElement.getAttribute("innerHTML");
		System.out.println(innerHTML);
		
		List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
		Thread.sleep(3000);
		
		for (WebElement element : liElements) {
			if (element.getText().contains(textToSelect)) {
				System.out.println("Selected: " + element.getText());
				element.click();
				break;
			
			}
			System.out.println(element.getText());
		}
		
	}
	

	@After
	public void tearDown() throws Exception {
		//Then	The user observes final results and closes test object
		Thread.sleep(10000);
		driver.quit();
	}

	

}
