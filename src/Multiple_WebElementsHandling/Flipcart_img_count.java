package Multiple_WebElementsHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_img_count {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver rv=new ChromeDriver();
		rv.get("https://www.amazon.in/");Thread.sleep(3000);
		//print total number of images shown home page
		List<WebElement> All_img = rv.findElements(By.tagName("img"));
		int img_count = All_img.size();Thread.sleep(3000);
		System.out.println(img_count);
		System.out.println("----------------------------------------------------");
		//open amzone-->search one plus-->print all oneplus reviews count
		rv.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");Thread.sleep(3000);
		rv.findElement(By.id("nav-search-submit-button")).click();Thread.sleep(3000);
		List<WebElement> review = rv.findElements(By.xpath(".//span[@class='a-size-base s-underline-text']"));Thread.sleep(3000);
		int reviewResult = review.size();Thread.sleep(3000);
		System.out.println(reviewResult);
		System.out.println("----------------------------------------------------");Thread.sleep(3000);
		//select internal memory 8gb -->print 1st 5 mobile details
		
		List<WebElement> oneplus_8gbRam = rv.findElements(By.xpath(".//span[contains(text(),('8GB RAM')) and starts-with(text(),('OnePlus'))]"));
		Thread.sleep(3000);
		/*List<WebElement> oneplus_price = rv.findElements(By.xpath(".//span[@class='a-price-whole']"));
		List<WebElement> oneplus_image = rv.findElements(By.xpath(".//img[@class='s-image']"));
		List<WebElement> oneplus_review = rv.findElements(By.xpath(".//span[@class='a-size-base s-underline-text']"));*/
		
		for (int i = 0; i < 5; i++) {
			WebElement modelnames = oneplus_8gbRam.get(i);
			String modelName_output = modelnames.getText();
			System.out.println(i+" index Model name :-"+modelName_output);
			
		}
		System.out.println("----------------------------------------------------");Thread.sleep(5000);
		List<WebElement> oneplus_price = rv.findElements(By.xpath(".//span[@class='a-price-whole']"));
		for (int j = 0; j < 5; j++) {
			WebElement price = oneplus_price.get(j);
			String price_output = price.getText();
			System.out.println(j+" index model price :-"+price_output);
		}
		System.out.println("----------------------------------------------------");Thread.sleep(3000);
		List<WebElement> oneplus_image = rv.findElements(By.xpath(".//img[@class='s-image']"));Thread.sleep(5000);
		for (int p = 0; p < 5; p++) {
			WebElement img = oneplus_image.get(p);
			String img_output = img.getAttribute("src");
			System.out.println(p+" index model image :-"+img_output);
		}
		System.out.println("----------------------------------------------------");Thread.sleep(3000);
		List<WebElement> oneplus_review = rv.findElements(By.xpath(".//span[@class='a-size-base s-underline-text']"));Thread.sleep(5000);
		for (int q = 0; q < 5; q++) {
			WebElement review1 = oneplus_review.get(q);
			String review_output = review1.getText();
			System.out.println(q+" index model review :-"+review_output);
			
		}
		/*Thread.sleep(3000);
		for (int i = 0; i < args.length; i++) {
			
			String output = oneplus_8gbRam.get(i).getText();
			String result = oneplus_price.get(i).getText();
			String img_output = oneplus_image.get(i).getText();
			String review_output = oneplus_review.get(i).getText(); 
			System.out.println(output+":- "+result+" \n"+review_output+"\n"+img_output);
			System.out.println("----------------------------------------------------");
		}*/
		
		rv.close();
	}

}
//span[contains(text(),('8GB RAM')) and starts-with(text(),('OnePlus'))]