package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SubscriptionInHomepage_10 {

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
//		Actions a=new Actions(rv);
//		a.sc
		//scroll to bottom of page
		JavascriptExecutor js=(JavascriptExecutor)rv;Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");Thread.sleep(2000);
		//Verify text 'SUBSCRIPTION'
		WebElement subscription = rv.findElement(By.xpath(".//h2[contains(text(),'Subscription')]"));Thread.sleep(2000);
		String expectedSubscrip_Text = "SUBSCRIPTION";
		if (subscription.getText().contains(expectedSubscrip_Text)) {
			System.out.println(subscription.getText()+" text verified");
		} else {
			System.out.println("Text not verifyed..");
		}
		System.out.println("------------------------------");Thread.sleep(2000);
		//enter email
		rv.findElement(By.id("susbscribe_email")).sendKeys("admin777@gmail.com");Thread.sleep(2000);
		rv.findElement(By.id("subscribe")).click();
		/*
		 * success verified message is getting off when cursor moved
		 */
		WebElement sucessSubscriped = rv.findElement(By.xpath(".//div[contains(text(),'You have been successfully subscribed!')]"));
		if (sucessSubscriped.getText().contains("successfully subscribed!")) {
			System.out.println("'You have been successfully subscribed!'");
		} else {
			System.err.println("Sorry...Message not displayed...");
		}
		
	}

}
