package basicweb;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxDriverWin {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "driver path"); not needed in this SlWebDriver version
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://www.google.com";
		
		
		
		
		driver.get(baseURL);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));
		
		driver.close();
	}

}
