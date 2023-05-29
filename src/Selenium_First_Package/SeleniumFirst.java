package Selenium_First_Package;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumFirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Selenium java code
		ChromeDriver rv= new ChromeDriver();
		//EdgeDriver rv = new EdgeDriver();
//					Thread.sleep(3000);
		// open app
		rv.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		// open Facebook
		rv.get("https://facebook.com");
		// go back to google
		rv.navigate().back();
		Thread.sleep(3000);
		// go to next page
		rv.navigate().forward();
		Thread.sleep(3000);
		// refresh page
		rv.navigate().refresh();
		Thread.sleep(3000);
		// change browser size
		Dimension d = new Dimension(400, 500);
		rv.manage().window().setSize(d);
		Thread.sleep(3000);
		// change browser position
		Point p = new Point(250, 600);
		rv.manage().window().setPosition(p);
		Thread.sleep(3000);
		// MAXIMIZE BROWSER
		rv.manage().window().maximize();
		Thread.sleep(3000);
		// minimize brower
		rv.manage().window().minimize();
		Thread.sleep(3000);
		// close browser
		rv.close();

	}

}
