package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new ChromeDriver();
		rv.get("http://www.facebook.com");
		Thread.sleep(3000);
		rv.findElement(By.id("email")).sendKeys("admin@123");
		rv.findElement(By.id("pass")).sendKeys("admin123");
	}

}
