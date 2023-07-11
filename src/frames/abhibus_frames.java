package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class abhibus_frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver rv=new ChromeDriver();Thread.sleep(3000);
		rv.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");Thread.sleep(3000);
		WebElement googleAccountFrame = rv.findElement(By.xpath("(.//iframe)[4]"));Thread.sleep(3000);
		rv.switchTo().frame(googleAccountFrame);Thread.sleep(6000);
		rv.findElement(By.xpath("(.//input[@id='s'])[1]")).sendKeys("testing");Thread.sleep(5000);
		rv.findElement(By.xpath(".//button[@class='button_search']")).click();Thread.sleep(5000);
		rv.findElement(By.xpath(".//a[contains(text(),'Tool Selection – 2')]")).click();
		Actions a=new Actions(rv);
		a.scrollByAmount(0, 3000);
		a.scrollByAmount(0, 3000);
		Thread.sleep(3000);
		//scroll inside frame by identifying
		WebElement scroll_tgt = rv.findElement(By.xpath(".//strong[contains(.,'Framework in Automation')]"));
		Thread.sleep(3000);
		a.scrollToElement(scroll_tgt);
		
		
	}

}
