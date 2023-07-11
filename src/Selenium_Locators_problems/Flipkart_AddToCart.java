package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Multiple_WebElementsHandling.FindElements;

public class Flipkart_AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		//rv.navigate().to("https://www.flipkart.com/");
		
		rv.get("https://www.flipkart.com/");Thread.sleep(7000);
		rv.manage().window().maximize();
		rv.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();Thread.sleep(3000);
		rv.findElement(By.name("q")).sendKeys("samsung mobiles 5g");Thread.sleep(7000);
		rv.findElement(By.xpath(".//button[@type='submit']")).click();Thread.sleep(5000);
		rv.findElement(By.xpath(".//div[text()='SAMSUNG Galaxy F14 5G (GOAT Green, 128 GB)']")).click();Thread.sleep(8000);
		rv.navigate().to("https://shorturl.at/cdmy6");Thread.sleep(8000);
		WebElement tgt = rv.findElement(By.xpath(".//div[@class='_1AtVbE col-12-12']//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		Thread.sleep(5000);
		//rv.findElement(By.xpath(".//button[.=' Add to cart']")).click();
		Actions a=new Actions(rv);
		a.moveToElement(tgt).click().perform();
		rv.close();
		
		
	
		

	}

	

}
