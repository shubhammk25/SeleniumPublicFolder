package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductQuantity_inCart_012 {
	
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
		//click on view products
		rv.findElement(By.xpath(".//a[@href='/product_details/1']")).click();
		//click on add to cart
		rv.findElement(By.xpath(".//button[@type='button']")).click();
		//click on continue shopping
		rv.findElement(By.xpath(".//button[@data-dismiss='modal']")).click();
		//
	}

}
