package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OKP335");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("WSX12345");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7654321");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();   
		Thread.sleep(2000);
		    String actualuid = driver.findElement(By.xpath("//span[text()='OKP335']")).getText();
		Thread.sleep(1000);
		 String expectedUID =("OKP335");
		 if (expectedUID.equals(actualuid) )  {
			 System.out.println(" tc pass");
		 }
			 else  System.out.println( " fail");
		 
		 
		 }
	

		
	}


