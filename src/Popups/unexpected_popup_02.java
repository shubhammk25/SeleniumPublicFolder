package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unexpected_popup_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		rv.close();

	}

}
