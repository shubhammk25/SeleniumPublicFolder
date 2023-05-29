package Multiple_WebElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver rv = new ChromeDriver();
		rv.get("https://www.google.com/");
		List<WebElement> Links = rv.findElements(By.tagName("a"));
		int count_links = Links.size();
		System.out.println(count_links);
		Thread.sleep(2000);
		for (WebElement text_link : Links) {
			String text_ouput = text_link.getText();
			System.out.println("Text link output :" + text_ouput);
		}
		System.out.println("------------------------------");
		Thread.sleep(2000);
		for (WebElement text_attribute : Links) {
			String attribute_output = text_attribute.getAttribute("href");
			System.out.println(attribute_output);
		}
		int visible_links=0,invisible_links=0;
		for (WebElement display_output : Links) {
			if (display_output.isDisplayed()) {
				visible_links++;
				
			} else {
				invisible_links++;
			}
		}
		System.out.println("Links are Displayed:- "+visible_links);
		System.out.println("Links are Not Displayed:- "+invisible_links);
		rv.close();
	
	}

}
