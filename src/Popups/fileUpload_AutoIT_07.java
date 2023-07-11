package Popups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload_AutoIT_07 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv= new ChromeDriver();

		rv.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//span[contains(text(),'Select PDF file')]")).click();
		
	}

}
