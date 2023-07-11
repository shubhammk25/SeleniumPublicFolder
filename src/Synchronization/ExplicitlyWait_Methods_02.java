package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait_Methods_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		WebDriverWait wait=new WebDriverWait(rv, Duration.ofSeconds(10));
		WebElement checkBox = rv.findElement(By.id("keepLoggedInCheckBox"));
		checkBox.click();
		try {
			wait.until(ExpectedConditions.elementToBeSelected(checkBox));
			System.out.println("Checkbox is selected");
		} catch (TimeoutException e) {
			// TODO: handle exception
			System.out.println("CheckBox is not selected");
		}
		System.out.println("--------------------");
		WebElement loginButton = rv.findElement(By.id("loginButton"));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(loginButton));
			System.out.println("Element is clicable");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element is clicable");
		}
		System.out.println("--------------------");
		loginButton.click();
		WebElement error_msg = rv.findElement(By.xpath("(.//span[@class='errormsg'])[1]"));
		System.out.println(error_msg.getText());
		try {
			wait.until(ExpectedConditions.visibilityOf(error_msg));
			System.out.println("error msg is displyaed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error message is not displayed");
		}
	}

}
