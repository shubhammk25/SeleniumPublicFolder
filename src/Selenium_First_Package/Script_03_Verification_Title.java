package Selenium_First_Package;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_03_Verification_Title {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver rv=new ChromeDriver();
		
		//open app
		rv.get("https://www.facebook.com");
		Thread.sleep(1000);
		String title=rv.getTitle();
		if(title.contains("log in or sign up"))
			System.out.println("Login page displayed");
		else
			System.out.println("Login page not displayed.");
		//rv.close();
	}

}