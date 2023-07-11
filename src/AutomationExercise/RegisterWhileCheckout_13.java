package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterWhileCheckout_13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv= new ChromeDriver();
		rv.get("https://automationexercise.com/");Thread.sleep(2000);
		rv.findElement(By.xpath("(.//a[@data-product-id='1'])[1]")).click();Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@class='btn btn-success close-modal btn-block']")).click();
		rv.findElement(By.xpath(".//a[contains(text(),'Cart')]")).click();
		WebElement cartPage = rv.findElement(By.xpath(".//li[contains(text(),'Shopping Cart')]"));
		if (cartPage.getText().contains("Shopping Cart")) {
			System.out.println("Cart is page displayed");
		} else {
			System.err.println("It's Bug..Cart page is not Displayed");
		}
		//proceed to checkout
		rv.findElement(By.xpath(".//a[@class='btn btn-default check_out']")).click();
		rv.findElement(By.xpath(".//u[contains(text(),'Register / Login')]")).click();
		CreateAccount.createaccount();
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

		rv.findElement(By.xpath(".//a[contains(text(),'Cart')]")).click();
		rv.findElement(By.xpath(".//a[@class='btn btn-default check_out']")).click();
		
		
		
		
		
	}

}
