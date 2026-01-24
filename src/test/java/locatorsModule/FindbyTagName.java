package locatorsModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindbyTagName {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String baseURL ="http://www.demostore.x-cart.com/";
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
		
		driver.findElement(By.tagName("a")).click();
		
		/*
		 * ways you can find elements (locators)
		 * id - fastest
		 * name
		 * classname
		 * xpath - reliable
		 * link text
		 * partial link text
		 * tagname
		 * css selector - widely used aswell
		 */

	}

}
