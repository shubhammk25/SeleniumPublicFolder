package Selenium_Locators_problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv= new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		//for Username
		//rv.findElement(By.id("username")).sendKeys("trainee");	
		//rv.findElement(By.className("textField")).sendKeys("");
		//rv.findElement(By.name("username")).sendKeys("trainee");
		rv.findElement(By.cssSelector("#username")).sendKeys("admin");
		Thread.sleep(2000);
		
		//for Password
		//rv.findElement(By.className("textField pwdfield")).sendKeys("trainee");
		rv.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		//rv.findElement(By.cssSelector(".pwdfield")).sendKeys("trainee");
		
		//for Checkbox of login
		//rv.findElement(By.id("keepLoggedInCheckBox")).click();
		//rv.findElement(By.name("remember")).click();
		rv.findElement(By.cssSelector("#keepLoggedInCheckBox")).click();
		Thread.sleep(2000);
		
		//for click on login
		rv.findElement(By.id("loginButton")).click();
		//rv.findElement(By.className("initial")).click();
		//rv.findElement(By.cssSelector("#loginButton")).click();
		//rv.findElement(By.xpath("#loginButton")).click();
		//Thread.sleep(3000);
		
		//for  click on timetrack
		//rv.findElement(By.className("content selected tt")).click();
		//rv.findElement(By.id("container_tt")).click();
		Thread.sleep(5000);
		//rv.findElement(By.className("addTaskButton enabled")).click();
		rv.findElement(By.id("addTaskButtonId")).click();
		
		//select gallary cooperation
		//rv.findElement(By.className("selectedItem")).sendKeys("- New Customer -");
		//rv.findElement(By.xpath(".//div[@style'display: block;']")).sendKeys("Galaxy Corporation");
		//rv.findElement(By.xpath(".//input[type='text']")).sendKeys("Galaxy Corporation");
		//rv.findElement(By.className("dropdownButton")).sendKeys("Galaxy Corporation");
		//rv.findElement(By.className("searchInputPlaceholder")).sendKeys("Galaxy Corporation");
		rv.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[1]")).sendKeys("Galaxy Corporation");
		Thread.sleep(5000);
		
		
		
		rv.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[2]/td[1]/input")).sendKeys("Android prototyping");
		Thread.sleep(2000);
		
		
		rv.findElement(By.xpath(".//input[@maxlength='255']")).sendKeys("Shubham");
		Thread.sleep(2000);
		
		
		rv.findElement(By.className("nameCell first")).sendKeys("complete todays work");
		Thread.sleep(2000);
		
		
		rv.findElement(By.className("components_button_label")).click();
		
		
		
	}

}
