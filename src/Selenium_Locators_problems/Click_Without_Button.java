package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Without_Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		rv.findElement(By.id("username")).sendKeys("admin");Thread.sleep(1000);
		rv.findElement(By.id("username")).sendKeys(Keys.CONTROL,"a");Thread.sleep(1000);
		rv.findElement(By.id("username")).sendKeys(Keys.BACK_SPACE);Thread.sleep(1000);
		rv.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(1000);
		rv.findElement(By.id("keepLoggedInCheckBox")).sendKeys(Keys.SPACE);Thread.sleep(2000);
		rv.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		
		
		
	}

}
