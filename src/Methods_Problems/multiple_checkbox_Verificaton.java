package Methods_Problems;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_checkbox_Verificaton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		rv.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		rv.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		rv.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(2000);
		rv.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		rv.findElement(By.id("container_tasks")).click();
		Thread.sleep(5000);
		// all checkbox
		
		//WebElement task_cb = rv.findElement(By.xpath("(.//div[@class='img'])[1]"));
//		task_cb.click();
//		Thread.sleep(4000);
//		boolean value1=task_cb.isSelected();
//		System.out.println(value1);
//		Thread.sleep(2000);
//		if (value1) {
//			System.out.println("selected");
//		} else {
//			System.out.println("not selected");
//		}
//		System.out.println("-------------------------");
		
		rv.findElement(By.xpath("(.//div[@class='img'])[1]")).click();
		Thread.sleep(5000);
		WebElement cb1 = rv.findElement(By.xpath("(.//div[@class='img'])[5]"));
		boolean v1 = cb1.isSelected();
		Thread.sleep(5000);
		if (v1) {
			System.out.println(" 5th position selected");
		} else {
			System.out.println("5th position not selected");
		}
		rv.close();
	
	}
}
//(.//div[@class='img'])[1]
//(.//div[@class='checkbox active'])[1]