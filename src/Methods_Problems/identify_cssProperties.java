package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class identify_cssProperties {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		rv.findElement(By.id("username")).sendKeys("adminnnn");
		Thread.sleep(2000);
		rv.findElement(By.name("pwd")).sendKeys("managerrrr");
		Thread.sleep(5000);
		rv.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		 WebElement errormsg = rv.findElement(By.xpath("(.//span[@class='errormsg'])[1]"));
		//error msg font size
		 String fontSize = errormsg.getCssValue("font-size");
		 System.out.println(fontSize);
		 //error msg color code
		 String fontcolorCode = errormsg.getCssValue("color");
		 System.out.println(fontcolorCode);
		 //convert rgb to hexa
		 String color_hex = Color.fromString(fontcolorCode).asHex();
		 //verify color red or not
		 if (color_hex.endsWith("#ce0100")) {
			System.out.println("color is red");
		}else {
			System.out.println("color is not red");
		}
	}

}
