package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPop_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();Thread.sleep(3000);
		opt.addArguments("start-maximized");
		WebDriver rv=new ChromeDriver(opt);
		Thread.sleep(3000);
		rv.get("https://www.google.com");
	

	}
	

}
