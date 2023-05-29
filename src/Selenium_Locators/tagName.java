package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver rv = new ChromeDriver();// open browser
		rv.get("file:///D:/Manul%20Testing%20Reports/Selenium_html/tagname.html");// open app
		Thread.sleep(3000);// Delay
		// identify element
		WebElement ele = rv.findElement(By.tagName("input"));
		ele = rv.findElement(By.tagName("input")); // enter text in box
		ele.sendKeys("Selenium");
		Thread.sleep(3000);
		ele.clear();
		rv.close();

	}

}
