package test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookMyShow {

	
		private WebDriver driver;
		private String baseURL;

		@Before
		public void setUp() throws Exception {
			System.clearProperty("weebDriver.chrome.driver,\", \"C:\\\\Drivers\\\\chromeeddriver.exe");
			driver = new ChromeDriver();
			baseURL = "https://www.bookmyshow.com/";
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
			@Test
			
			public void test() 
			{
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
				
				//search city
				driver.findElement(By.xpath(".//*[@id='modal-root']/div/div/div/div[1]/div/div/input")).sendKeys("Mumbai");
				driver.findElement(By.xpath(".//*[@id='modal-root']/div/div/div/div[1]/div/div/input")).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.xpath(".//*[@id='modal-root']/div/div/div/div[1]/div/div/input")).sendKeys(Keys.ARROW_DOWN.ENTER);
				
				//click on movies
				driver.findElement(By.xpath(" //*[@id=\"super-container\"]/div[2]/header /div[2]/div/div/div/div[1]/div/a[1]")).click();
				//explore movies
				driver.findElement(By.xpath(" //*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[2]/div/div/div[2]/a/div/div/[2]/div/img"));
				
				//select lang
			
				driver.findElement(By.xpath(" //*[@id=\"super-container\"]/div[2]/div[3]/div[1]/div/div[2]/div[1]/div[1]/div[1]")).click();
			}

			@After
			public void tearDown() throws Exception {
				
				//driver.close();
			


		

	}

}
