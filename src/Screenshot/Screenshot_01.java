package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_01 {
	
	private static final String FileUtils = null;

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//step 01= typecasting about takescreenshot
		 TakesScreenshot s= (TakesScreenshot) driver;
		 
		 //step 02 import file.utils
		 File src= s.getScreenshotAs(OutputType.FILE);
		 
		 //step 03 create object on file
		 
		File dest= new File(".//Selenium 1st/images/webpage.png");
		
		//step 04
		org.apache.commons.io.FileUtils.copyFile(src, dest);
	}
}
