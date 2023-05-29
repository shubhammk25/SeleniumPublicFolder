package Selenium_First_Package;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BH_pb_01 {

	public static void main(String[] args) {

		ChromeDriver rv = new ChromeDriver();
		// open app
		rv.get("https://www.google.com");
		rv.get("https://www.facebook.com");
		ChromeDriver rv1 = new ChromeDriver();
		rv1.get("https://www.google.com");
		rv1.get("https://www.facebook.com");
		rv.close();
		rv1.close();
	}
}
