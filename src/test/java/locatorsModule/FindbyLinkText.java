package locatorsModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FindbyLinkText {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		String baseURL ="https://www.letskodeit.com";
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
		
		driver.findElement(By.linkText("SIGN IN")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("PRACT")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Element Practice']")).click();
		
		//--------------access test page ^ -------------------------------
		/* 	
		Yet to solve	 
		maybe try the new learnt synthax for css selector : tag[attribute='value']
		driver.findElement(By.xpath("//select[contains(@id, 'carselect')and contains(@name, cars)]")).click();
		driver.findElement(By.id("carselect")).click();
		
		
		//driver.findElement(By.xpath("//*[@id='carselect']//option[text()='Honda']")).click();
		
		//driver.findElement(By.xpath("//option[@value='orange']")).click();
		
		driver.findElement(By.id("autosuggest"));
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).click();
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Automation");
		driver.findElement(By.id("id=ui-id-50")).click();
		*/
		
		driver.findElement(By.id("mousehover"));

		//driver.close();

	}

}
