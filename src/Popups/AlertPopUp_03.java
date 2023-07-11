package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		rv.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[text()='Click for JS Alert']")).click();Thread.sleep(3000);
		Alert simplealert = rv.switchTo().alert();
		System.out.println("Simple alert text:-"+simplealert.getText());Thread.sleep(5000);
		//prompt alert
		rv.findElement(By.xpath(".//button[contains(.,'Click for JS Prompt')]")).click();
		Alert promptalert = rv.switchTo().alert();
		promptalert.sendKeys("selenium");Thread.sleep(3000);
		promptalert.dismiss();Thread.sleep(3000);
		
		//confirmation alert
		rv.findElement(By.xpath(".//button[text()='Click for JS Confirm']")).click();Thread.sleep(3000);
		Alert conalert = rv.switchTo().alert();Thread.sleep(3000);
		conalert.dismiss();
		
		rv.close();
		
	}

}
