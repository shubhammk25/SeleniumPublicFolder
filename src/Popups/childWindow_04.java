package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindow_04 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.yatra.com/");Thread.sleep(8000);
		while(true)
		{
			try {
				WebElement unexpected_popup = rv.findElement(By.xpath(".//iframe[@title='notification-frame-~10cb42c72']"));
				rv.switchTo().frame(unexpected_popup);
				Thread.sleep(3000);
				rv.findElement(By.xpath(".//a[@class='close']")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		rv.switchTo().defaultContent();
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//a[contains(text(),'My Account')]")).click();Thread.sleep(3000);
		rv.findElement(By.xpath(".//a[@id='signInBtn']")).click();Thread.sleep(7000);
		rv.findElement(By.xpath(".//div[@class='media-buttons']//img")).click();Thread.sleep(7000);
		Set<String> ref = rv.getWindowHandles();Thread.sleep(7000);
		Iterator<String> itr= ref.iterator();Thread.sleep(3000);
		String main_refid = itr.next();
		String ch01_refid = itr.next();Thread.sleep(3000);
		rv.switchTo().window(ch01_refid);Thread.sleep(5000);
		rv.findElement(By.xpath(".//input[@type='email']")).sendKeys("admin123@gmai.com");Thread.sleep(3000);
		rv.close();Thread.sleep(3000);
		rv.switchTo().window(main_refid);
		rv.close();
		
	}  
}
