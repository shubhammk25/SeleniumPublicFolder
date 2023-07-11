package MouseAction;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUp_and_ScrollDownUsingActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver rv=new ChromeDriver();
		rv.get("http://www.flipkart.com/");Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();Thread.sleep(3000);//pop-window
		rv.findElement(By.className("_3704LK")).sendKeys("mobiles");Thread.sleep(3000);
		rv.findElement(By.className("L0Z3Pu")).click();Thread.sleep(3000);
		//scrolling by Actions class
		//newlly added in Action class its updated version
		Actions a=new Actions(rv);Thread.sleep(3000);
		a.scrollByAmount(0, 3000).perform();
		//scroll to target element
		WebElement tgt = rv.findElement(By.xpath(".//div[text()='Infinix HOT 30i (Glacier Blue, 64 GB)']"));
		Thread.sleep(3000);
		a.scrollToElement(tgt).perform();
		rv.close();
		
	}

}
