package Multiple_WebElementsHandling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_specifiModel_priceAscending {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv = new ChromeDriver();
		rv.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();//pop-window
		Thread.sleep(3000);
		rv.findElement(By.className("_3704LK")).sendKeys("iphone 14");//search box
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//button[@type='submit']")).click();//click 
		Thread.sleep(3000);
		//model name stores int array
		List<WebElement> model_name = rv.findElements(By.xpath(".//div[@class='_4rR01T' and contains(text(),'APPLE iPhone 14 (')]"));
		System.out.println("Total iphone 14 models count:- "+model_name.size());
		Thread.sleep(3000);
		//price of model name get stored into array
		List<WebElement> model_price = rv.findElements(By.xpath(".//div[@class='_4rR01T' and contains(text(),'APPLE iPhone 14 (')]/../..//div[@class='_30jeq3 _1_WHN1']"));
		//System.out.println("Model Price in ascending order:- " + model_price);
		System.out.println("===========================");
		
		//Approach 1:- using ArrayList
		Thread.sleep(3000);
		ArrayList<Integer> ref=new ArrayList<>();//create array object 
		for (int i = 0; i <model_price.size(); i++) {
				String output = model_price.get(i).getText();//$79,9999
				String output1 = output.substring(1);//79,999
				String output2 = output1.replaceAll(",","");//799999
				int price=Integer.parseInt(output2);
				ref.add(price);
				
		}
		System.out.println(ref.size());
		//do sorting
		Thread.sleep(3000);
		Collections.sort(ref);
		for (int i = 0; i < ref.size(); i++) {
			Integer rv1=ref.get(i);//sort the value
			System.out.println(rv1);//print the sorted value
		}
		Thread.sleep(5000);
		//print highest and lowset value
		System.out.println("===========================");
		System.out.println("Iphone 14 lowest price:- "+ref.get(0));
		System.out.println("Iphone 14 Highest price:- "+ref.get(ref.size()-1));
		System.out.println("===========================");
		Thread.sleep(3000);
		
		//Approach 2:- TreeSet
		TreeSet<Integer> ref1=new TreeSet<>();
		for (int i = 0; i < model_price.size(); i++) {
			String output = model_price.get(i).getText();//$79,9999
			String output1 = output.substring(1);//79,999
			String output2 = output1.replaceAll(",","");//79999
			int price=Integer.parseInt(output2);
			ref1.add(price);
			
		}
		Thread.sleep(3000);
		System.out.println("===========================");
		//print highest and lowset value
		System.out.println("Iphone 14 lowest price:- "+ref1.first());
		System.out.println("Iphone 14 Highest price:- "+ref1.last());
		rv.close();
	}

}
