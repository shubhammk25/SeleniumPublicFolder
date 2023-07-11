package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver rv = new ChromeDriver();
		rv.get("https://automationexercise.com/login");
		Thread.sleep(3000);
		// Verifying HomePage is Displyed or not
		String expected_title = "Automation Exercise";
		Thread.sleep(5000);
//		String title = rv.getTitle();
		if (expected_title.equals(rv.getTitle())) {
			System.out.println("Correct HomePage is Displayed");
		} else {
			System.out.println("Correct HomePage not is Displayed");
		}
		System.out.println("------------------------------");
		Thread.sleep(2000);
		rv.findElement(By.xpath(".//a[@href='/contact_us']")).click();
		//verify 'Get in touch '
		WebElement getTouch = rv.findElement(By.xpath(".//h2[contains(text(),'Get In Touch')]"));Thread.sleep(2000);
		//System.out.println(getTouch.getText());
		String expected_msg = "GET IN TOUCH";
		if (getTouch.getText().contains(expected_msg)) {
			System.out.println("Yes.."+expected_msg);
		} else {
			System.out.println("Messgage not displayed..");
		}
		System.out.println("------------------------------");
		Thread.sleep(2000);
		//enter name
		rv.findElement(By.xpath(".//input[@name='name']")).sendKeys("ShubhamKale");Thread.sleep(2000);
		rv.findElement(By.xpath(".//input[@name='email']")).sendKeys("shubhamk25@gmail.com");Thread.sleep(2000);
		rv.findElement(By.name("subject")).sendKeys("Product Review");Thread.sleep(2000);
		rv.findElement(By.id("message")).sendKeys("Helllo automation..good");Thread.sleep(2000);
		rv.findElement(By.xpath(".//input[@name='submit']")).click();Thread.sleep(5000);
		
		//pop window will open
		//pop window not closed by selenium
		
		WebElement success_msg = rv.findElement(By.xpath(".//div[@class='status alert alert-success']"));Thread.sleep(2000);
		if (success_msg.getText().contains("Success! Your details have been")) {
			System.out.println("Yess..Success message shown."+success_msg.getText());
		} else {
			System.out.println("Success Message not shown");
		}
		System.out.println("------------------------------");
		//click on home button
		rv.findElement(By.xpath(".//a[@class='btn btn-success']")).click();Thread.sleep(2000);
		
		// Verifying HomePage is Displyed or not
				String expected_titleHome = "Automation Exercise";
				Thread.sleep(5000);
//				String title = rv.getTitle();
				if (expected_titleHome.equals(rv.getTitle())) {
					System.out.println("User navigated to HomePage and homepage is Displayed");
				} else {
					System.out.println("User not navigated to HomePage");
				}
		rv.close();
	}

}
