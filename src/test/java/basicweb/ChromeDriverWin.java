package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWin {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","driver path");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://google.com";
		
		driver.get(baseURL);
		driver.close();

	}

}
