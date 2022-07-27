package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WithDDF {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\parametrization\\Book1.xlsx");
		
		Sheet sh= WorkbookFactory.create(file).getSheet("sheet1");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
              WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		//enter un using ddf
		     String un = sh.getRow(0).getCell(0).getStringCellValue();
		     driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		Thread.sleep(3000);
		//enter password
		
		   String pwd = sh.getRow(1).getCell(0).getStringCellValue();
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(pwd);

		
	}
     
}
