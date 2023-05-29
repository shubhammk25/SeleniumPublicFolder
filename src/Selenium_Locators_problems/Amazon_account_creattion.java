package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_account_creattion {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("http://surl.li/gwzbj");
		rv.findElement(By.id("ap_customer_name")).sendKeys("dinga");
		Thread.sleep(1000);
		rv.findElement(By.id("ap_phone_number")).sendKeys("9857756465");
		Thread.sleep(1000);
		rv.findElement(By.id("ap_email")).sendKeys("dinga12@gmail.com");
		Thread.sleep(1000);
		rv.findElement(By.id("ap_password")).sendKeys("Manga@123");
		Thread.sleep(1000);
		rv.findElement(By.id("continue")).click();Thread.sleep(1000);rv.close();
		
		
	}

}
