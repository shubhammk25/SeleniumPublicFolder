package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SausDemo_Problem {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		rv.findElement(By.name("user-name")).sendKeys("standard_user");	Thread.sleep(3000);
		rv.findElement(By.name("password")).sendKeys("secret_sauce");	Thread.sleep(3000);
		rv.findElement(By.id("login-button")).click();Thread.sleep(3000);
		rv.findElement(By.xpath(".//div[text()='Sauce Labs Backpack']")).click();	Thread.sleep(3000);
		rv.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();	Thread.sleep(3000);
		rv.findElement(By.xpath(".//a[@class='shopping_cart_link']")).click();	Thread.sleep(3000);
		rv.findElement(By.id("checkout")).click();	Thread.sleep(3000);
		rv.findElement(By.id("first-name")).sendKeys("Dinga");	Thread.sleep(3000);
		rv.findElement(By.id("last-name")).sendKeys("manga");	Thread.sleep(3000);
		rv.findElement(By.id("postal-code")).sendKeys("12344");	Thread.sleep(3000);
		rv.findElement(By.id("continue")).click();
		rv.findElement(By.id("finish")).click();	Thread.sleep(3000);
		rv.close();
	}

}
