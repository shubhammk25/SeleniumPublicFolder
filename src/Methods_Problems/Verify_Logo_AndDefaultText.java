package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Logo_AndDefaultText {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new ChromeDriver();
		rv.get("https://www.flipkart.com/");Thread.sleep(2000);
		rv.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement logo = rv.findElement(By.xpath(".//img[@title='Flipkart']"));Thread.sleep(2000);
		String logo_tagname = logo.getTagName();
		if (logo_tagname.equals("img")) {
			System.out.println("Yes, Logo is created with image Tag");
		} else {
			System.out.println("No, Logo is not created with image Tag");

		}
		Thread.sleep(2000);
		//verify default text in search bar
		WebElement searchbox = rv.findElement(By.className("_3704LK"));Thread.sleep(2000);
		String result = searchbox.getAttribute("placeholder");
		if (result.isEmpty()) {
			System.out.println("Search box is empty");
		} else {
			System.out.println("Search box is not empty");
		}
		System.out.println("text():-"+result);
		Thread.sleep(2000);
		searchbox.sendKeys("mobile");
		String enterd_text = searchbox.getAttribute("value");
		System.out.println("Entered Text:-"+enterd_text);
		rv.close();

	}
}


