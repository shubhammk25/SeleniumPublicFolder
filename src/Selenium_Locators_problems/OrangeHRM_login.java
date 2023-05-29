package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_login {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(2000);
		rv.findElement(By.name("txtUsername")).sendKeys("admin123@gmail.com");
		Thread.sleep(2000);
		rv.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		rv.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		rv.close();
		
		
		
	}

}
