package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchVideo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.youtube.com/");
		Thread.sleep(2000);
		rv.findElement(By.name("search_query")).sendKeys("jay shree ram");
		Thread.sleep(2000);
		rv.findElement(By.id("search-icon-legacy")).click();Thread.sleep(2000);rv.close();
		
	}

}
