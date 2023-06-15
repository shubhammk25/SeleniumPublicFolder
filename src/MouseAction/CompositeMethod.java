package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		rv.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		//find the both element
		WebElement tgt = rv.findElement(By.id("draggable"));Thread.sleep(3000);
		WebElement dest = rv.findElement(By.id("droppable"));Thread.sleep(3000);
		Actions a= new Actions(rv);Thread.sleep(2000);
		//bulid is used to combine all action into one action.
		a.moveToElement(tgt).clickAndHold().moveToElement(dest).build().perform();
		
		//we can make deleay in above composite methods
		//pause():- same like thread.sleep.
//		a.moveToElement(tgt).clickAndHold().pause(3000).moveToElement(dest).build().perform();
		rv.close();
	}

}
