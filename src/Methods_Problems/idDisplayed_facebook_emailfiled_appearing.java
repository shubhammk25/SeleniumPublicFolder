//following action
//open facebook-->click on create account-->enter email in email filed-->verify re-enter email filed displayed or not
//-->remove email -->verify re-enter email filed disapper or not.
package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idDisplayed_facebook_emailfiled_appearing {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.facebook.com/reg/"); 
		Thread.sleep(2000);
		WebElement Email = rv.findElement(By.name("reg_email__"));Thread.sleep(2000);
		Email.sendKeys("admin12@gmail.com");
		Thread.sleep(5000);
		WebElement reEmail = rv.findElement(By.name("reg_email_confirmation__"));
		Thread.sleep(5000);
		boolean output1 = reEmail.isDisplayed();Thread.sleep(5000);
		if (output1) {
			System.out.println("reEmail filed appeared");
		} else {
			System.out.println("reEmail filed not appeared");
		}
		Thread.sleep(2000);
		Email.clear();Thread.sleep(5000);
		boolean output2 = reEmail.isDisplayed();Thread.sleep(5000);
		if (output2) {
			System.out.println("reEmail filed still appeared");
		} else {
			System.out.println("reEmail filed dissappeared");
		}
		rv.close();
	}

}
