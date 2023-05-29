package Selenium_First_Package;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BH_pb_02 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver rv = new ChromeDriver();
		// open app
		rv.get("https://www.google.com");
		Thread.sleep(1000);
		rv.get("https://www.facebook.com");
		Thread.sleep(1000);
		rv.get("https://www.blinkit.com");
		Thread.sleep(1000);
		rv.get("https://www.youtube.com");
		Thread.sleep(1000);
		//rv.get("https://www.myntra.com");
		rv.navigate().to("https://www.facebook.com");
		rv.close();
		

	}
}
