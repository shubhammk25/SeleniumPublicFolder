package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_absolute {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("file:///C:/Users/admin/OneDrive/Desktop/API/HTML_Automation/firstHtml.html");
		//AnveshSir
		/*
		rv.findElement(By.xpath("./html/body/input[1]")).sendKeys("Dinga");
		rv.findElement(By.xpath("./html/body/input[2]")).sendKeys("Manga@123");
		rv.findElement(By.xpath("./html/body/input[3]")).sendKeys("123345");
		rv.findElement(By.xpath("./html/body/input[4]")).sendKeys("Manga12@gmail.com");
		rv.findElement(By.xpath("./html/body/input[5]")).click();
		rv.findElement(By.xpath("./html/body/input[7]")).click();*/
		
		//copy directly from element
		rv.findElement(By.xpath("/html/body/input[1]")).sendKeys("Dinga");
		Thread.sleep(1000);
		rv.findElement(By.xpath("/html/body/input[2]")).sendKeys("Manga@123");Thread.sleep(1000);
		rv.findElement(By.xpath("/html/body/input[3]")).sendKeys("123345");Thread.sleep(1000);
		rv.findElement(By.xpath("/html/body/input[4]")).sendKeys("Manga12@gmail.com");Thread.sleep(1000);
		rv.findElement(By.xpath("/html/body/input[5]")).click();Thread.sleep(1000);
		rv.findElement(By.xpath("/html/body/input[7]")).click();Thread.sleep(1000);
		rv.findElement(By.xpath("/html/body/input[8]")).click();Thread.sleep(1000);
		rv.findElement(By.xpath("/html/body/select")).click();Thread.sleep(1000);
		rv.findElement(By.xpath("/html/body/select/option[2]")).click();Thread.sleep(1000);rv.close();
		
		
		
		
	}

}
