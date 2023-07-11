package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_cssProperties_problem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		rv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//verifying logo
		Thread.sleep(3000);
		WebElement logo = rv.findElement(By.xpath(".//img[@src='/web/images/ohrm_branding.png?v=1683010990518']"));
		Thread.sleep(3000);
		String logoTag = logo.getTagName();
		if (logoTag.equals("img")) {
			System.out.println("logo is created using image tag");
		} else {
			System.out.println("logo is  notcreated using image tag");
		}
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------");
		//verifying unsername and password filed is displayed or not
		WebElement un = rv.findElement(By.name("username"));Thread.sleep(3000);
		boolean result1 = un.isDisplayed();
		if (result1) {
			System.out.println("username is displayed");
		} else {
			System.out.println("username is not displayed");
		}
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------");
		WebElement pwd = rv.findElement(By.name("password"));Thread.sleep(3000);
		boolean result2 = pwd.isDisplayed();
		if (result1) {
			System.out.println("password is displayed");
		} else {
			System.out.println("password is not displayed");
		}
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------");
		
		//enter invalid un& prints its css properties
		un.sendKeys("abcs");Thread.sleep(2000);
		String fontsize = un.getCssValue("font-size");Thread.sleep(2000);
		System.out.println(fontsize);
		String fontColor = un.getCssValue("color");Thread.sleep(2000);
		System.out.println(fontColor);
		String fontFamily = un.getCssValue("font-family");Thread.sleep(2000);
		System.out.println(fontFamily);
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------");
		
		//verifying password filed contains default text
		String pwd_text = pwd.getAttribute("placeholder");Thread.sleep(3000);
		if (pwd_text.isEmpty()) {
			System.out.println("password filed does not contains default text");
		}else {
			System.out.println("password filed does  contains default text:-"+pwd_text);
		}
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------");
		
		//verify passwrod filedis enabled or not& click on button
		boolean pwd_filed = pwd.isEnabled();Thread.sleep(3000);
		if (pwd_filed) {
			System.out.println("password filed is enabled");
		} else {
			System.out.println("password filed not is enabled");
		}
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------");
		pwd.sendKeys("ahdjd");Thread.sleep(3000);
		//verify login button is enabled or not
		WebElement login_button = rv.findElement(By.xpath(".//button[@type='submit']"));Thread.sleep(3000);
		boolean loginResult = login_button.isEnabled();
		if (loginResult) {
			System.out.println("Login button is enabled");
		} else {
			System.out.println("Login button is not enabled");
		}	
		Thread.sleep(3000);
		login_button.click();
		System.out.println("-------------------------------------------------");
		//verifying error msg and css properties
		Thread.sleep(5000);
		WebElement error_msg = rv.findElement(By.xpath(".//p[.='Invalid credentials']"));
		Thread.sleep(3000);
		boolean errorResult = error_msg.isDisplayed();
		if (errorResult) {
			System.out.println("error message is displayed");
		} else {
			System.out.println("error message is displayed "+error_msg);
		}
		Thread.sleep(3000);
		String error_msg_color = error_msg.getCssValue("color");
		Thread.sleep(2000);
		System.out.println(error_msg_color);
		String error_msg_size = error_msg.getCssValue("font-size");
		System.out.println(error_msg_size);
		System.out.println("-------------------------------------------------");
		
		rv.close();
		
	}

}
