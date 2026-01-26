package junit;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitIntro {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		

	}
	
	@AfterClass
	public static void tearDownAfterCkass() throws Exception {
		System.out.println("Test Suite Ended");
	}
	
	
	@Before
	public void setUp() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.letskodeit.com/practice";
		driver.get(baseURL);
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void test1() {
		
		
		
	}
	@Test
	public void test2() {
		
		
	}
	

}
