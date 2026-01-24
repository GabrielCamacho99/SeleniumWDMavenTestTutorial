	package locatorsModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindbyClassDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String baseURL ="https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
		
		driver.findElement(By.className("btn-style")).click();

	}

}
