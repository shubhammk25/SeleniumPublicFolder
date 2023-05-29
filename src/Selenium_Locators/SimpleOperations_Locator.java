package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleOperations_Locator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.instagram.com");
		Thread.sleep(3000);
		rv.findElement(By.name("username")).sendKeys("admin@123");
		rv.findElement(By.name("password")).sendKeys("admin123");
		rv.findElement(By.className("_acan _acap _acas _aj1-")).click();
		
	}

}
