//open atitime -> verify checkbox is selected or not //,and verify selected or not 
package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_Method {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");Thread.sleep(2000);
		WebElement checkbox=rv.findElement(By.id("keepLoggedInCheckBox"));
		Thread.sleep(2000);
		checkbox.click();Thread.sleep(2000);
		boolean value=checkbox.isSelected();Thread.sleep(2000);
		if (value==true) {
			System.out.println("selected");
		} else {
			System.out.println(" not selected");
		}
		checkbox.click();
		boolean value2=checkbox.isSelected();Thread.sleep(2000);
		if (value2) {
			System.out.println("selected");
		} else {
			System.out.println(" not selected");
		}
	}

}
