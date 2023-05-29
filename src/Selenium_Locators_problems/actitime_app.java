package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime_app {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		rv.findElement(By.id("toPasswordRecoveryPageLink")).click();
		rv.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("admin@123");
		Thread.sleep(3000);
		rv.findElement(By.id("forgetPasswordButton")).click();rv.close();
	}

}
