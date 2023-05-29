package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.facebook.com");
		Thread.sleep(3000);
		rv.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		rv.findElement(By.name("email")).sendKeys("admin@123");
		Thread.sleep(3000);
		rv.findElement(By.name("did_submit")).click();rv.close();
		
	}

}
