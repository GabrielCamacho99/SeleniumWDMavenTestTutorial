package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MSEdgeDriverDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		String baseURL = "https://www.google.com";
		
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.close();
		
		

	}

}
