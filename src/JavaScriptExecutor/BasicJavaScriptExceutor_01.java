package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicJavaScriptExceutor_01 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.google.com/");
		Thread.sleep(8000);
		JavascriptExecutor js= (JavascriptExecutor) rv;
		//open app
		Thread.sleep(8000);
		js.executeScript("window.location='https://demo.actitime.com/login.do'");
		//js.executeScript("https://demo.actitime.com/login.do");Thread.sleep(3000);
		//Navigate to back
		js.executeScript("history.go(-1)");Thread.sleep(5000);
		//refresh page
		js.executeScript("history.go(0)");Thread.sleep(5000);
		//navigate to forward
		js.executeScript("history.go(+1)");Thread.sleep(5000);
		
		
		//enter username
		js.executeScript("document.getElementById('username').value='admin'");Thread.sleep(5000);
		//enter password
		js.executeScript("document.getElementsByName('pwd').value='manager'");Thread.sleep(8000);
		//select checkbox
		js.executeScript("document.getElementById('keepLoggedInCheckBox').checked=true");Thread.sleep(2000);
		//diselect checkbox
		js.executeScript("document.getElementById('keepLoggedInCheckBox').checked=false");Thread.sleep(2000);
		//click on login
		WebElement loginButton = rv.findElement(By.xpath(".//div[text()='Login ']"));
		js.executeScript("arguments[0]",loginButton);
		Thread.sleep(3000);rv.close();
	}

}
