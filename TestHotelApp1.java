package test;




public class TestHotelApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("weebDriver.chrome.driver,", "C:\\Drivers\\chromeeddriver.exe");
		org.openqa.selenium.WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		String baseURL="http://adactinhotelapp.com";
		driver.get(baseURL);

	}

}
