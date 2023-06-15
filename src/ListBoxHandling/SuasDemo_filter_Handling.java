package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SuasDemo_filter_Handling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		rv.findElement(By.name("user-name")).sendKeys("standard_user");	Thread.sleep(3000);
		rv.findElement(By.name("password")).sendKeys("secret_sauce");	Thread.sleep(3000);
		rv.findElement(By.id("login-button")).click();Thread.sleep(3000);
		WebElement filter = rv.findElement(By.className("product_sort_container"));
		Thread.sleep(3000);
		filter.click();
		Thread.sleep(3000);
		Select s=new Select(filter);
		Thread.sleep(3000);
		s.selectByVisibleText("Price (high to low)");
		rv.close();
	}

}
