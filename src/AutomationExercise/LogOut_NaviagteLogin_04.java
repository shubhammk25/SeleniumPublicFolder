package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut_NaviagteLogin_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv = new ChromeDriver();
		// open app
		rv.get("https://automationexercise.com/");
		Thread.sleep(2000);
		System.out.println("------------------------------");
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
		rv.findElement(By.xpath(".//a[@href='/login']")).click();
		Thread.sleep(2000);

		// verifying login page is Displyed or not
		String login_title = "Automation Exercise - Signup / Login";
		Thread.sleep(5000);
		// String title1 = rv.getTitle();
		if (login_title.equals(rv.getTitle())) {
			System.out.println("Correct LoginPage is Displayed");
		} else {
			System.out.println("Correct LoginPage is not Displayed");
		}
		System.out.println("------------------------------");
		Thread.sleep(3000);

//		CreateAccount.createaccount();
//		Thread.sleep(5000);
		rv.findElement(By.xpath("(.//input[@name='email'])[1]")).sendKeys("shubhamk25@gmail.com");
		Thread.sleep(2000);
		rv.findElement(By.xpath(".//input[@name='password']")).sendKeys("MSdhoni07");
		Thread.sleep(2000);
		rv.findElement(By.xpath("(.//button[@class='btn btn-default'])[1]")).click();
		Thread.sleep(5000);

		// verify user logged with its name or not
		WebElement userName = rv.findElement(By.xpath(".//a[contains(.,'Logged in as')]//b[.='ShubhamKale']"));
		Thread.sleep(2000);
		String output = userName.getText();

		if (output.contains("ShubhamKale")) {
			System.out.println("Yess..user logged with it's name");
		} else {
			System.out.println("Nooo..user not logged with it's name");
		}
		Thread.sleep(3000);
		
		//logout
		rv.findElement(By.xpath(".//a[@href='/logout']")).click();
		System.out.println("------------------------------");
		//again verify navigated to title page or not
		String login_title1 = "Automation Exercise - Signup / Login";
		Thread.sleep(5000);
		// String title1 = rv.getTitle();
		if (login_title1.equals(rv.getTitle())) {
			System.out.println("Yess..Navigation to Login page is done");
		} else {
			System.out.println("Noo..not Navigated to Login Page");
		}

	}

}
