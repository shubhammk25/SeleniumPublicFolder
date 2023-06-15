package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_ALLMethods_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver rv=new ChromeDriver();
		rv.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		//find the both element
		WebElement tgt = rv.findElement(By.id("draggable"));Thread.sleep(3000);
		WebElement dest = rv.findElement(By.id("droppable"));Thread.sleep(3000);
		Actions a= new Actions(rv);Thread.sleep(3000);
		
		/*
		//approach 01
		a.moveToElement(tgt).perform();Thread.sleep(2000);
		//this used to perform liftClick and hold action
		a.clickAndHold().perform();Thread.sleep(2000);
		a.moveToElement(dest).perform();Thread.sleep(2000);
		//this mthod used to release the performed action
		a.release().perform();
		Thread.sleep(2000);
		*/
		
		
		//approach 02
//		a.clickAndHold(tgt).perform();Thread.sleep(3000);
//		a.moveToElement(dest, 100, 100).perform();Thread.sleep(3000);
//		
		//approach 03
		//this method is used drag and drop action directly from element to element;
//		a.dragAndDrop(tgt, dest).perform();Thread.sleep(2000);
		
		//appproch 04
		//this method used to drag and drop target element by giving size
		a.dragAndDropBy(tgt, 300, 400).perform();Thread.sleep(2000);
		//rv.close();
		
		
	}

}
