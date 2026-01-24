package basicweb;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

	
	public static void main(String[] args) {
		
		//WebDriver driver1 = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		String baseURL = ("https://www.letskodeit.com/practice");
		
		//driver1.get("https://www.google.com");
		driver.get(baseURL);
		
		//driver1.close();
		driver.close();
	}

}
