package MouseAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConetextClick_and_Click {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver rv= new ChromeDriver();
		rv.manage().window().maximize();
		rv.get("https://www.yatra.com/");
		Thread.sleep(3000);
		WebElement tgt = rv.findElement(By.xpath("(.//img[@class='conta iner large-banner'])[1]"));
		Thread.sleep(3000);
		Actions a=new Actions(rv);
		a.moveToElement(tgt);	Thread.sleep(2000);
		a.contextClick().perform();	Thread.sleep(3000);
		//a.contextClick(tgt).perform();
		//keystorkes are not working so created robot class
		Robot r =new Robot();	Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_V);//clicks on save image
		rv.close();
	
	}

}
