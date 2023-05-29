package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Faccebook_accoun_creation {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.facebook.com/reg/");
		Thread.sleep(3000);
		rv.findElement(By.name("firstname")).sendKeys("aaaaaa");
		rv.findElement(By.name("lastname")).sendKeys("bbbbbbb");
		rv.findElement(By.name("reg_email__")).sendKeys("admin@123");
		rv.findElement(By.name("reg_passwd__")).sendKeys("admin123");
		rv.findElement(By.name("birthday_day")).sendKeys("25");
		rv.findElement(By.name("birthday_month")).sendKeys("June");
		rv.findElement(By.name("birthday_year")).sendKeys("2000");
		//Thread.sleep(3000);
		//rv.findElement(By.id("u_0_5_pc")).click();
		Thread.sleep(3000);
		rv.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();rv.close();
		
		
		
	}

}
