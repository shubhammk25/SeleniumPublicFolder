package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_UN_BYone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		//rv.findElement(By.id("username")).sendKeys("admin");Thread.sleep(1000);
		String str="admin123";
		rv.findElement(By.id("username")).sendKeys(str);Thread.sleep(1000);
		for (int i = 0; i < str.length(); i--) {
			rv.findElement(By.id("username")).sendKeys(Keys.BACK_SPACE);
			Thread.sleep(1000);	
		}
		rv.close();
		
		/*This method also works
		 WebElement un=rv.findElement(By.id("username"));
		 String str="admin123";
		 un.sendKeys(str);
		 for (int i = 0; i < str.length(); i++) {
			un.sendKeys(Keys.BACK_SPACE);
			
		}
		*/
		
		
	}

}
