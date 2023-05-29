//enter text in un filed->copy un->paste in pwd filed without identfying pswd filed.
package Selenium_Locators_problems;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_Identifying_Pwd_Filed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv = new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		rv.findElement(By.id("username")).sendKeys("admin");Thread.sleep(1000);
		rv.findElement(By.id("username")).sendKeys(Keys.CONTROL,"a");Thread.sleep(1000);
		rv.findElement(By.id("username")).sendKeys(Keys.CONTROL,"c");Thread.sleep(1000);
		rv.findElement(By.id("username")).sendKeys(Keys.TAB+""+Keys.CONTROL,"v");Thread.sleep(1000);
		//by using chrods method
		rv.findElement(By.id("username")).sendKeys(Keys.chord(Keys.TAB,Keys.CONTROL+"v"));
		rv.close();
	}

}
