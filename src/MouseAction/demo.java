package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://en-gb.facebook.com/reg/");Thread.sleep(3000);
		WebElement UserName = rv.findElement(By.name("firstname"));Thread.sleep(3000);
		boolean output = UserName.isEnabled();Thread.sleep(3000);
		if (output) {
			System.out.println("Enabled");
		} else {
			System.out.println("Disabled");
		}
		System.out.println("--------------------");
		
		if (UserName.isDisplayed()) {
			System.out.println("display");
		} else {
			System.out.println(" not display");
		}
		System.out.println("--------------------");Thread.sleep(3000);
		
		WebElement femaleRadio = rv.findElement(By.xpath("(.//input[@name='sex'])[2]"));Thread.sleep(3000);
		if (femaleRadio.isEnabled()) {
			System.out.println("Enabled");
		} else {
			System.out.println("Disabled");
		}
		
		femaleRadio.click();Thread.sleep(3000);
		System.out.println("--------------------");
		Thread.sleep(3000);
		if(femaleRadio.isSelected())
		{
			System.out.println("selected");
		}else {
			System.out.println("not selected");
		}
		rv.close();
	}
	
}
