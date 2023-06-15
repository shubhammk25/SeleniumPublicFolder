package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_login_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		//open app
		rv.get("https://automationexercise.com/");Thread.sleep(2000);
		System.out.println("------------------------------");
		//Verifying HomePage is Displyed or not
		String expected_title = "Automation Exercise";Thread.sleep(5000);
//		String title = rv.getTitle();
		if (expected_title.equals(rv.getTitle())) {
			System.out.println("Correct HomePage is Displayed");
		} else {
			System.out.println("Correct HomePage not is Displayed");
		}
		System.out.println("------------------------------");Thread.sleep(2000);
		rv.findElement(By.xpath(".//a[@href='/login']")).click();Thread.sleep(2000);
		
		//verifying login page is Displyed or not
		String login_title = "Automation Exercise - Signup / Login";Thread.sleep(5000);
		//String title1 = rv.getTitle();
		if (login_title.equals(rv.getTitle())) {
			System.out.println("Correct LoginPage is Displayed");
		} else {
			System.out.println("Correct LoginPage is not Displayed");
		}
		System.out.println("------------------------------");Thread.sleep(3000);
		
		CreateAccount.createaccount();
		Thread.sleep(5000);
		rv.findElement(By.xpath("(.//input[@name='email'])[1]")).sendKeys("ddddduuuu@gmail.com");Thread.sleep(2000);
		rv.findElement(By.xpath(".//input[@name='password']")).sendKeys("MSdhi07");Thread.sleep(2000);
		rv.findElement(By.xpath("(.//button[@class='btn btn-default'])[1]")).click();Thread.sleep(5000);
		
		//Verifying error msg is displayed or not
		WebElement error_msg = rv.findElement(By.xpath(".//p[contains(text(),'Your email or password is incorrect!')]"));
		Thread.sleep(5000);
//		String output = error_msg.getText();
		String expected_op = "Your email or password is incorrect!";
		Thread.sleep(5000);
		if (error_msg.getText().contains(expected_op)) {
			System.out.println(expected_op);
		} else {
			System.out.println("Not showing error message");
		}
		Thread.sleep(3000);
		rv.close();


	}

}
