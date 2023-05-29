//to verify error msg displyed or not -->open actitime-->login with invalid un&pwd-->verify msg
package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed1_Error_msg_displayed {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		rv.findElement(By.id("username")).sendKeys("adminnnn");
		Thread.sleep(2000);
		rv.findElement(By.name("pwd")).sendKeys("managerrrr");
		Thread.sleep(5000);
		rv.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		 WebElement errormsg = rv.findElement(By.xpath("(.//span[@class='errormsg'])[1]"));
		 Thread.sleep(5000);
		 //displaying error message
		 boolean result = errormsg.isDisplayed();
		 Thread.sleep(5000);
		 if (result) {
			System.out.println("Error message displayed");
			String output = errormsg.getText();
			System.out.println("Error message:- "+output);
		} else {
			System.out.println("Error message  not displayed");
		}
		rv.close();
	}

}
