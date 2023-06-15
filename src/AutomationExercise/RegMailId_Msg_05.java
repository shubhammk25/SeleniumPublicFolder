package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegMailId_Msg_05 {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//verify New user SignUp is displayed or not
		WebElement Signup_Txt = rv.findElement(By.xpath(".//h2[contains(.,'New User Signup!')]"));Thread.sleep(3000);
		String exp_Signup_text = "New User Signup!";Thread.sleep(3000);
		if (Signup_Txt.getText().contains(exp_Signup_text)) {
			System.out.println("Text Displyed:-"+exp_Signup_text);
		} else {
			System.out.println("Noo.. Not Text Displayed");
		}
		System.out.println("------------------------------");Thread.sleep(3000);
		
		//enter already register mail id and check msg
		rv.findElement(By.xpath(".//input[@name='name']")).sendKeys("Shubham K");Thread.sleep(3000);
		rv.findElement(By.xpath("(.//input[@name='email'])[2]")).sendKeys("shubhamkale20708@gmail.com");Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@data-qa='signup-button']")).click();Thread.sleep(3000);
		//error msg
		WebElement error_msg = rv.findElement(By.xpath(".//p[contains(.,'Email Address already exist!')]"));Thread.sleep(3000);
		String expected_msg = "Email Address already exist!";Thread.sleep(3000);
		if (error_msg.getText().contains(expected_msg)) {
			System.out.println("Correct Message:-"+expected_msg);
		} else {
			System.out.println("opps!...Wrong Message displayed");
		}
		
		rv.close();

	}
}
