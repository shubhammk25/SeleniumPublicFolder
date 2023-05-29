package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new ChromeDriver();
		rv.get("file:///C:/Users/admin/OneDrive/Desktop/API/HTML_Automation/firstHtml.html");
		Thread.sleep(1000);
		rv.findElement(By.cssSelector("body > input[type=text]:nth-child(1)")).sendKeys("Dinga123");
		Thread.sleep(1000);
		rv.findElement(By.cssSelector("body > input[type=passwrod]:nth-child(3)")).sendKeys("Manga@123");
		Thread.sleep(1000);
		rv.findElement(By.cssSelector("body > input[type=text]:nth-child(5)")).sendKeys("123456");
		Thread.sleep(1000);
		rv.findElement(By.cssSelector("body > input[type=text]:nth-child(7)")).sendKeys("Dinga12@gmail.com");
		Thread.sleep(1000);
		rv.findElement(By.cssSelector("body > input[type=radio]:nth-child(9)")).click();
		Thread.sleep(1000);
		rv.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(1000);
		rv.findElement(By.cssSelector("body > select")).click();
		Thread.sleep(1000);
		rv.findElement(By.cssSelector("body > select > option:nth-child(2)")).click();Thread.sleep(2000);rv.close();
			
	}

}
