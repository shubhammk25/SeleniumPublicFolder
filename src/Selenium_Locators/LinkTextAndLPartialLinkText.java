package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndLPartialLinkText {
	
	public static void main(String[] args) {
		WebDriver rv=new ChromeDriver();
		rv.get("http://www.facebook.com");
		rv.findElement(By.linkText("Forgotten password?")).click();
	}

}
