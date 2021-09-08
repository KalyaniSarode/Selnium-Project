package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;
import java.time.LocalDate;

public class HotelAppTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("weebDriver.chrome.driver,\", \"C:\\\\Drivers\\\\chromeeddriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseURL = "https://adactinhotelapp.com/";
		driver.get(baseURL);
		driver.navigate().to("https://adactinhotelapp.com/");
		
		//Login Page
		
		driver.findElement(By.id("username")).sendKeys("kalyaniss");
		driver.findElement(By.id("password")).sendKeys("29kss#");
		driver.findElement(By.id("login")).click();
		
		//Search hotel
		Select loc1=new Select(driver.findElement(By.id("location")));
		loc1.selectByIndex(0);
		loc1.selectByVisibleText("London");
		
		Select loc2=new Select(driver.findElement(By.id("hotels")));
		//loc2.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loc2.selectByVisibleText("Hotel Creek");
		
		Select loc3=new Select(driver.findElement(By.id("room_type")));
		//loc3.selectByIndex(2);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loc3.selectByVisibleText("Standard");
		
		Select loc4=new Select(driver.findElement(By.id("room_nos")));
		loc4.selectByIndex(2);

		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("05/10/2021");
		
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("12/10/2021");
		
		
		Select apr=new Select(driver.findElement(By.id("adult_room")));
		apr.selectByIndex(2);
		
		Select cpr=new Select(driver.findElement(By.id("child_room")));
		cpr.selectByIndex(2);
		
		driver.findElement(By.id("Submit")).click();
		//driver.findElement(By.id("Reset")).click();
		
		//Select Hotel

		driver.findElement(By.id("radiobutton_0")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.id("continue")).click();
		
		//Book Hotel
		driver.findElement(By.id("first_name")).sendKeys("Kalyani");
		driver.findElement(By.id("last_name")).sendKeys("Sarode");
		driver.findElement(By.id("address")).sendKeys("Bhamberi,Akola");
		driver.findElement(By.id("cc_num")).sendKeys("1212454578789636");
		
		Select cctype=new Select(driver.findElement(By.id("cc_type")));
		cctype.selectByIndex(1);
		
		Select ccexpmonth=new Select(driver.findElement(By.id("cc_exp_month")));
		ccexpmonth.selectByIndex(2);
		
		Select ccexpyear=new Select(driver.findElement(By.id("cc_exp_year")));
		ccexpyear.selectByIndex(4);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("455");
		driver.findElement(By.id("book_now")).click();
		//driver.findElement(By.id("cancel")).click();
		
		//Booking confirmation
		//driver.findElement(By.id("search_hotel")).click();
		driver.findElement(By.id("my_itinerary")).click();
		//driver.findElement(By.id("logout")).click();
		
		//driver.close();+
		
	}

}



