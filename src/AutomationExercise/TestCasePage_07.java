package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasePage_07 {

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
		System.out.println("------------------------------");Thread.sleep(3000);
		rv.findElement(By.xpath(".//a[.=' Test Cases']")).click();Thread.sleep(3000);
		WebElement testcasePage = rv.findElement(By.xpath(".//div[@class='col-sm-9 col-sm-offset-1']//b"));Thread.sleep(3000);
		//System.out.println(testcasePage.getText());
		String expected_pageTitle = "TEST CASES";
		if (testcasePage.getText().contains(expected_pageTitle)) {
			System.out.println("Yes..User navigated to Test Case page");
		} else {
			System.out.println("No..User still not navigated to Test Case page");
		}
		rv.close();

	}

}
//
