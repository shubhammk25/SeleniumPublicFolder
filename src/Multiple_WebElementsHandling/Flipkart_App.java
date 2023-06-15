package Multiple_WebElementsHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_App {
	private static final String String = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new ChromeDriver();
		rv.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		rv.findElement(By.className("_3704LK")).sendKeys("iphone 14");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@type='submit']")).click();
		Thread.sleep(3000);
		List<WebElement> model_name = rv.findElements(By.className("_4rR01T"));
		Thread.sleep(3000);
		List<WebElement> model_price = rv.findElements(By.xpath(".//div[@class='_4rR01T']/../..//div[@class='_30jeq3 _1_WHN1']"));
		
		/*for (WebElement model_details : model_name) {
			String str = model_details.getText();
			System.out.println(str);
		}
		System.out.println("----------------------------------------");
		Thread.sleep(3000);
		for (WebElement model_price1 : model_price) {
			String output = model_price1.getText();
			System.out.println(output);
		}*/
		for (int i = 0; i < model_name.size(); i++) {
			
			String output = model_name.get(i).getText();
			String result = model_price.get(i).getText();
			System.out.println(output+":- "+result);
			
		}
		rv.close();

	}

}
