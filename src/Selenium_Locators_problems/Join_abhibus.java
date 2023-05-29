package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Join_abhibus {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.abhibus.com");
		Thread.sleep(1000);
		rv.findElement(By.id("AccLogin")).click();
		rv.findElement(By.id("mobileNo")).sendKeys("9834896847");
		Thread.sleep(1000);
		rv.findElement(By.id("getop")).click();
		Thread.sleep(1000);
		rv.findElement(By.name("signinotp")).sendKeys("424100");
		Thread.sleep(1000);
		rv.findElement(By.id("signinVerify")).click();
		Thread.sleep(1000);
		rv.findElement(By.name("reg_FName")).sendKeys("Dinga");
		Thread.sleep(1000);
		rv.findElement(By.name("reg_EmailID")).sendKeys("sk123@gmail.com");
		Thread.sleep(1000);
		rv.findElement(By.id("saveProfile")).click();
		rv.close();
		
	}

}
