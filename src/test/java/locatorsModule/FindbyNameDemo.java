package locatorsModule;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindbyNameDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String baseURL ="https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("enter-name")).sendKeys("Automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.close();
	}

}
