package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductsInCart_011 {

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
		//again add product in cart
		WebElement prod01 = rv.findElement(By.xpath("(.//p[contains(.,'Men Tshirt')])[1]"));Thread.sleep(2000);
//		System.out.println(prod01.getText());
		rv.findElement(By.xpath("(.//a[@data-product-id='2'])[1]")).click();Thread.sleep(4000);
		//click on continue shopping
		rv.findElement(By.xpath(".//button[@data-dismiss='modal']")).click();Thread.sleep(4000);
		//again add product in cart
		WebElement prod02 = rv.findElement(By.xpath("(.//p[contains(.,'Blue Top')])[1]"));
//		System.out.println(prod02.getText());
		rv.findElement(By.xpath("(.//a[@data-product-id='1'])[1]")).click();Thread.sleep(4000);
		//again click on continue shopping
		rv.findElement(By.xpath(".//button[@data-dismiss='modal']")).click();Thread.sleep(4000);
		
		//click on Cart
		rv.findElement(By.xpath(".//a[contains(text(),'Cart')]")).click();Thread.sleep(4000);
		WebElement expected_Prod01 = rv.findElement(By.xpath(".//a[contains(.,'Men Tshirt')]"));Thread.sleep(4000);
//		System.out.println(expected_Prod01.getText());
		WebElement expected_prod02 = rv.findElement(By.xpath(".//a[contains(.,'Blue Top')]"));Thread.sleep(4000);
//		System.out.println(expected_prod02.getText());
		Thread.sleep(4000);
		if ((prod01.getText().equals(expected_Prod01.getText())) && (prod02.getText().equals(expected_prod02.getText()))) {
			System.out.println("Added to Cart Products are same..");
		} else {
			System.out.println("Added to cart Products are not same..");
		}	
	}

}
