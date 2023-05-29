package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndependent {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.amazon.in/");//Thread.sleep(500);
		Thread.sleep(8000);
		rv.findElement(By.name("field-keywords")).sendKeys("iphone 14");//Thread.sleep(500);
		Thread.sleep(8000);
		rv.findElement(By.id("nav-search-submit-button")).click();//Thread.sleep(500);
		Thread.sleep(8000);
		rv.findElement(By.xpath(".//span[text()='Apple iPhone 14 (128 GB) - Blue']/../..//span[contains(text(),'79,900')]")).click();
		
	}

}
//@class='a-price-whole'][normalize-space()=