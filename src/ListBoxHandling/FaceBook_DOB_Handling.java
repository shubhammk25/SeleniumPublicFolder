package ListBoxHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_DOB_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		rv.get("https://en-gb.facebook.com/reg/");Thread.sleep(3000);
		//Approach 1
		WebElement day = rv.findElement(By.id("day"));
		Thread.sleep(3000);
		day.sendKeys(Keys.DOWN);Thread.sleep(3000);
		day.click();
		Thread.sleep(3000);
		
		//Appraoch 2
		rv.findElement(By.xpath(".//select[@title='Month']")).click();
		Thread.sleep(3000);
		/*
		 * class Robot
		 * {
		 * 		public keypress(keyEvent.refvar_DOWN);
		 * }
		 */
		Robot r=new Robot();//Robot is class present inside Java package
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		//Approach 3
		WebElement year = rv.findElement(By.id("year"));Thread.sleep(3000);
		/*
		 * clas Select{
		 * 		Select(Webelement refVarible)
		 * 		{
		 * 			parameterised constructor;
		 * 		}
		 * 		public SelectByIndex{}
		 * 		public SelectByValue{}
		 * 		public SelectByVisibleText{}
		 * }
		 */
		Select s=new Select(year);Thread.sleep(3000);//Select is Selenium
		s.selectByIndex(7);Thread.sleep(3000);//
		s.selectByValue("1990");Thread.sleep(3000);
		s.selectByVisibleText("1983");Thread.sleep(3000);
		rv.close();
		

	}

}
