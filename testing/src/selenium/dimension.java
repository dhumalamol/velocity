package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class dimension {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
	
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/login/");
		
		  // String url = driver.getCurrentUrl();
		//   System.out.println(url);
		
	}

}
