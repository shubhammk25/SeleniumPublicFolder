package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valid_login_02 {
	
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
		rv.findElement(By.xpath("(.//input[@name='email'])[1]")).sendKeys("shubhamk25@gmail.com");Thread.sleep(2000);
		rv.findElement(By.xpath(".//input[@name='password']")).sendKeys("MSdhoni07");Thread.sleep(2000);
		rv.findElement(By.xpath("(.//button[@class='btn btn-default'])[1]")).click();Thread.sleep(5000);
		
		//verify user logged as username
		WebElement username = rv.findElement(By.xpath(".//a[contains(.,'Logged in as')]//b[.='ShubhamKale']"));Thread.sleep(5000);
		String output = username.getText();Thread.sleep(5000);
		if (output.equals("ShubhamKale")) {
			System.out.println("User Logged with its name");
		}else {
			System.out.println("User not Logged with its name");
		}
		System.out.println("------------------------------");Thread.sleep(2000);
		
		//verify account deleted or not
		rv.findElement(By.xpath(".//a[@href='/delete_account']")).click();Thread.sleep(5000);
		WebElement deleteAcc = rv.findElement(By.xpath(".//b[.='Account Deleted!']"));Thread.sleep(5000);
//		String output1 = deleteAcc.getText();
		String output1 = "Account Deleted!";
//		System.out.println(output1);
		//output coming wrong
		if (deleteAcc.getText().equals(output1)) {
			System.out.println("Account Deleted Sucessfully");
		} else {
			System.out.println("Account not Deleted yet!!!!!!");
		}
		
		rv.close();
	}


}
