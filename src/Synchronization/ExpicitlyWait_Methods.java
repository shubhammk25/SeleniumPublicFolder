package Synchronization;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpicitlyWait_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver rv= new ChromeDriver();
		rv.get("https://the-internet.herokuapp.com/javascript_alerts");
		rv.findElement(By.xpath(".//button[contains(text(),'Click for JS Alert')]")).click();
		WebDriverWait wait=new WebDriverWait(rv, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(200));
		Alert output = wait.until(ExpectedConditions.alertIsPresent());
		//System.out.println(output);
		System.out.println("Alert is present");
		rv.switchTo().alert().accept();
		
	}

}
