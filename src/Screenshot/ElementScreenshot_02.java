package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		WebElement tgt=rv.findElement(By.id("loginButton"));
		
		TakesScreenshot s= (TakesScreenshot) rv;

		File src = tgt.getScreenshotAs(OutputType.FILE);
		File dest= new File(".//Selenium1st/images/Element.png");
		FileUtils.contentEquals(src, dest);
		
	}

}
//   .//*[local-name()='svg' and @class='value']