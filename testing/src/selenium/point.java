package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class point {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
