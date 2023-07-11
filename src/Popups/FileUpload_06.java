package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_06 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new ChromeDriver();
		rv.get("file:///D:/Testing%20Documents/Selenium_html/fileUpload.html");Thread.sleep(3000);
		String absoultePath = "D:\\Testing Documents\\Selenium_html\\google.txt"; Thread.sleep(3000);
		Thread.sleep(3000);
		rv.findElement(By.id("myFile")).sendKeys(absoultePath);
		Thread.sleep(3000);

		rv.close();
		
	}

}
