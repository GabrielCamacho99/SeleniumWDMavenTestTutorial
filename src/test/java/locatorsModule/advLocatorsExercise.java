package locatorsModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class advLocatorsExercise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String url1 = "https://www.letskodeit.com/practice";
		String url2 = "https://www.letskodeit.com/courses";
		
		
		
		//Exercise1
		driver.get(url1);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[contains(text(), 'Python')]//following-sibling::td")).getLocation();
		Thread.sleep(3000);
		driver.close();
		
		//Exercise2
		
		Thread.sleep(6000);
		WebDriver driver2 = new ChromeDriver();
		driver2.get(url2);
		driver2.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/a"));
		driver2.findElement(By.xpath("//a[@href='/courses/selenium-webdriver-with-java']//parent::div//parent::div//preceding-sibling::div[1]")).click();
		driver2.close();
	}

}
