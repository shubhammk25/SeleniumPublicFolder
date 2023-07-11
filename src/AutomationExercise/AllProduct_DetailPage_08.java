package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllProduct_DetailPage_08 {

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
		//click on product
		rv.findElement(By.xpath(".//a[contains(text(),'Products')]")).click();Thread.sleep(4000);
		//verify All products
		WebElement allProduct = rv.findElement(By.xpath(".//h2[contains(text(),'All Products')]"));
		String expextedAllProduct = "ALL PRODUCTS";
		if (allProduct.getText().contains(expextedAllProduct)) {
			System.out.println("Yes..user naviagted to All products");
		} else {
			System.out.println("No..user not naviagted to All products");
		}Thread.sleep(4000);
		//click on 1st view product
		rv.findElement(By.xpath(".//a[@href='/product_details/1']")).click();Thread.sleep(4000);
		//verify the details;
		rv.close();
	}

}
