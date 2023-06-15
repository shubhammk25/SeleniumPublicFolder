package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollandSlide {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		rv.get("http://www.flipkart.com/");Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();Thread.sleep(3000);//pop-window
		rv.findElement(By.className("_3704LK")).sendKeys("mobiles");
		rv.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor) rv;
		//scroll down
		for (int i = 1; i <=5; i++) {
			js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);
		}
		//scroll up
		for (int i = 1; i <=5; i++) {
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-300)");
			
		}
		Thread.sleep(2000);
		
		//scroll to bottom of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");Thread.sleep(2000);
		//scroll to again top of page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");Thread.sleep(2000);
			//we can use this also
		//js.executeScript("window.scrollBy(0,0)");
		//js.executeScript("window.scrollTo(0,document.body.scrollTop)");
		
		/*
		//slide to Right
		js.executeScript("window.scrollBy(document.body.scrollWidth,0)");Thread.sleep(2000);
		//scroll to again left of page
		js.executeScript("window.scrollBy(-document.body.scrollWidth,0)");Thread.sleep(2000);
			//we can use this also
		//js.executeScript("window.scrollBy(0,0)");
		//js.executeScript("window.scrollTo(document.body.scrollLeft,0)");
		 * 
		 */
		
		//scroll to target element
		WebElement tgt = rv.findElement(By.xpath(".//div[text()='POCO C55 (Cool Blue, 64 GB)']"));Thread.sleep(2000);
		int xloc = tgt.getLocation().getX();
		int yloc = tgt.getLocation().getY();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy("+xloc+","+yloc+")");
		Thread.sleep(2000);
		rv.close();

	}

}
