package locatorsModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindbyClassDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String baseURL ="https://www.facebook.com";
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div/span/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.className("inputtext")).sendKeys("automation");
		driver.findElement(By.className("selected")).click();
		

	}

}
