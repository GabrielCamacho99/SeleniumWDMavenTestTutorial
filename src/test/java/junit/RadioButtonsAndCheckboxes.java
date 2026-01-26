package junit;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsAndCheckboxes {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
	
	@Test
	public void test() throws InterruptedException {
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click(); System.out.println("BMW radio clicked");
		System.out.println("BMW radiobtn is selected? " +  bmwRadioBtn.isSelected());
		
		Thread.sleep(2000);
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click(); System.out.println("Benz radio clicked");
		System.out.println("BMW radiobtn is selected? " +  bmwRadioBtn.isSelected());
		System.out.println("Benz radiobtn is selected? " +  benzRadioBtn.isSelected());
		
		Thread.sleep(2000);
		WebElement hondaRadioBtn = driver.findElement(By.id("hondaradio"));
		hondaRadioBtn.click(); System.out.println("Honda radio clicked");
		System.out.println("Benz radiobtn is selected? " +  benzRadioBtn.isSelected());
		System.out.println("Honda radiobtn is selected? " +  hondaRadioBtn.isSelected());
		
		Thread.sleep(2000);
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click(); System.out.println("BMW checkbx clicked");
		
		
		Thread.sleep(2000);
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click(); System.out.println("Benz checkbx clicked");
		
		
		Thread.sleep(2000);
		WebElement hondaCheckBox = driver.findElement(By.id("hondacheck"));
		hondaCheckBox.click(); System.out.println("Honda checkbx clicked");
		
		Thread.sleep(2000);
		bmwCheckBox.click();
		Thread.sleep(2000);
		benzCheckBox.click();
		
		System.out.println("BMW radiobtn is selected? " +  bmwRadioBtn.isSelected());
		System.out.println("Benz radiobtn is selected? " +  benzRadioBtn.isSelected());
		System.out.println("Honda radiobtn is selected? " +  hondaRadioBtn.isSelected());
		System.out.println("BMW checkbx is selected? " +  bmwCheckBox.isSelected());
		System.out.println("Benz checkbx is selected? " +  benzCheckBox.isSelected());
		System.out.println("Honda checkbx is selected? " +  hondaCheckBox.isSelected());
		
		
		
		
		
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}