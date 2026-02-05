package actionsClasses;

import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class DragAndDropActions {
	private WebDriver driver;
	private String baseURL;

	

	@Before
	public void setUp() throws Exception {
		//Open and setup test object
		driver = new ChromeDriver();
		baseURL = "https://jqueryui.com/droppable/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	
	@Test
	public void test() throws Exception {

		driver.switchTo().frame(0);
		
		WebElement fromElement = driver.findElement(By.id("draggable"));
		WebElement toElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//Drag and drop
//		action.dragAndDrop(fromElement, toElement).build().perform();
		
		//Click and hold, move to element, release, build and perform
		action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
		
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
