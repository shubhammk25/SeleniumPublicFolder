package Selenium_First_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_04_Verification_Title2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv= new ChromeDriver();
		rv.get("file:///C:/Users/admin/OneDrive/Desktop/API/HTML_Automation/firstHtml.html");Thread.sleep(2000);
		String title=rv.getTitle();
		Thread.sleep(2000);
		if (title.contains("DemoWebsite")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title not Matched");
		}
		rv.close();
	}

}
