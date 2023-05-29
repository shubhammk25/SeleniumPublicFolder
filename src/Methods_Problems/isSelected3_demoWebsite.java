package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected3_demoWebsite {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new ChromeDriver();
		rv.get("file:///C:/Users/admin/OneDrive/Desktop/API/HTML_Automation/firstHtml.html");
		WebElement radio1=rv.findElement(By.xpath("/html/body/input[5]"));Thread.sleep(2000);
		radio1.click();Thread.sleep(2000);
		boolean value1=radio1.isSelected();
		if (value1) {
			System.out.println("Selected");
		} else {
			System.out.println("not Selected");
		}

		
		Thread.sleep(2000);
		WebElement radio2=rv.findElement(By.xpath(".//input[@value='2']"));Thread.sleep(2000);
		radio2.click();
		boolean value2=radio1.isSelected();
		if (value2) {
			System.out.println("Selected");
		} else {
			System.out.println("not Selected");
		}
		
		
		Thread.sleep(2000);
		WebElement radio3=rv.findElement(By.xpath(".//input[@value='3']"));Thread.sleep(2000);	
		radio3.click();
		boolean value3=radio1.isSelected();
		if (value3) {
			System.out.println("Selected");
		} else {
			System.out.println("not Selected");
		}
		
		
	}

}
