package test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonTest {

	
		private WebDriver driver;
		private String baseURL;

		@Before
		public void setUp() throws Exception {
			System.clearProperty("weebDriver.chrome.driver,\", \"C:\\\\Drivers\\\\chromeeddriver.exe");
			driver = new ChromeDriver();
			baseURL = "https://www.amazon.in/";
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}

		
		@Test
		public void test() {
			driver.get(baseURL);
			//driver.findElement(By.xpath(baseURL))
			
			driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			//driver.findElement(By.id("nav-flyout-ya-newCust")).click();
			
			//Sign In Username
			driver.findElement(By.xpath("//*[@id=\'ap_email\']")).sendKeys("kalyanisarode29@gmail.com");
			//driver.findElement(By.id("ap_email")).sendKeys("kalyanisarode@gmail.com");
			driver.findElement(By.id("continue")).click();
			
			//Sign In Pass
			driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Kalyani2998#");
			driver.findElement(By.id("signInSubmit")).click();
			
			driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("airpods");
			driver.findElement(By.id("nav-search-submit-button")).click();
			
		}
		
		@After
		public void tearDown() throws Exception {
			
			//driver.close();
		


	


	}

}
