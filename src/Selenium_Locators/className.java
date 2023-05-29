package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class className {
	
	public static void main(String[] args) {
		WebDriver rv=new ChromeDriver();
		rv.get("http://www.flipkart.com");
		rv.findElement(By.className("_3704LK")).sendKeys("iphone 14");
		rv.findElement(By.className("L0Z3Pu")).click();
	}

}
