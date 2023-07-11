package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraFRamescount {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();Thread.sleep(3000);
		rv.get("https://www.yatra.com/");
		Thread.sleep(3000);
		List<WebElement> frames = rv.findElements(By.tagName("iframe"));
		int count = frames.size();
		System.out.println(count);
		rv.close();
	}

}
