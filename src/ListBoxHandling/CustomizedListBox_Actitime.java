package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedListBox_Actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		rv.findElement(By.id("username")).sendKeys("admin");Thread.sleep(2000);
		rv.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(2000);
		rv.findElement(By.id("loginButton")).click();Thread.sleep(2000);
		rv.findElement(By.id("addTaskButtonId")).click();Thread.sleep(5000);
		WebElement ListBox = rv.findElement(By.xpath(".//div[contains(text(),'- Select Customer -')]"));Thread.sleep(5000);
		ListBox.sendKeys(Keys.DOWN);Thread.sleep(2000);
		ListBox.sendKeys(Keys.DOWN);Thread.sleep(2000);
		ListBox.sendKeys(Keys.DOWN);Thread.sleep(2000);
		ListBox.click();
	
	//	ListBox.click();
		rv.findElement(By.xpath(".//input[@placeholder='Enter Customer Name']")).sendKeys("Dinga");Thread.sleep(2000);
		rv.findElement(By.xpath(".//input[@placeholder='Enter Project Name']")).sendKeys("QspiderApp");Thread.sleep(2000);
		rv.findElement(By.xpath("(.//input[@class='inputFieldWithPlaceholder'])[1]")).sendKeys("seleniumListBox");Thread.sleep(2000);
		rv.findElement(By.xpath(".//div[@class='components_button withPlusIcon']")).click();Thread.sleep(2000);
		rv.close();
	}

}
