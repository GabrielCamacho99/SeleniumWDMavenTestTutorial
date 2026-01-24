package locatorsModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdXPATHDemo {

	public static void main(String[] args) {
		
		//initiating variables
		String baseURL = "https://www.letskodeit.com";
		WebDriver driver = new ChromeDriver();
		
		//setting the browser
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		
		//test steps
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']")).sendKeys("test@testmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("login-password")).sendKeys("testpw123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//button[@id='login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//driver.close();
		
		

	}

}
