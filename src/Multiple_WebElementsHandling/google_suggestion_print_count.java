package Multiple_WebElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_suggestion_print_count {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv= new ChromeDriver();
		rv.get("https://www.google.co.in/");Thread.sleep(1000);
		rv.findElement(By.name("q")).sendKeys("Selenium");Thread.sleep(3000);
		List<WebElement> sugg = rv.findElements(By.xpath(".//div[@class='pcTkSc']//span[starts-with(text(),'selenium')]"));Thread.sleep(1000);
		int sugg_count = sugg.size();Thread.sleep(3000);
		System.out.println("suggestion showing are:- "+sugg_count);
		System.out.println("-------------------------------------------");
		for (int i = 0; i < sugg.size(); i++) {
			String sugg_text = sugg.get(i).getText();
			System.out.println(sugg_text);
		}
		System.out.println("-------------------------------------------");
		sugg.get(5).click();
		Thread.sleep(3000);
		rv.close();
	}
}
