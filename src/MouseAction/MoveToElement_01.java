package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class MoveToElement_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv= new ChromeDriver();
		rv.manage().window().maximize();
		rv.get("https://www.yatra.com/");
		
		Thread.sleep(3000);
		WebElement tgt = rv.findElement(By.linkText("My Account"));
		Thread.sleep(3000);
		Actions a=new Actions(rv);
		//MoveToElement method
		a.moveToElement(tgt).perform();
		
		rv.findElement(By.xpath("(.//*[contains(text(),'Sign Up')])[1]")).click();
		rv.close();
	}

}
