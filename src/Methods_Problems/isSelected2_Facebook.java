package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected2_Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new ChromeDriver();
		rv.get("https://www.facebook.com/reg/");
		Thread.sleep(2000);
		//WebElement radio1 = rv.findElement(By.xpath(".//label[text()='Female' or @for='u_0_4_ch']"));
		WebElement radio1=rv.findElement(By.xpath("(//*[@class='_8esa'])[1]"));
		//WebElement radio1 = rv.findElement(By.xpath(".//label[text()='Female']"));
		Thread.sleep(2000);
		boolean value1 = radio1.isSelected();
		System.out.println(value1);
		Thread.sleep(2000);
		if (value1) {
			System.out.println("selected");
		} else {
			System.out.println("not selected");
		}
		Thread.sleep(2000);
		System.out.println("-------------------");
		
		radio1.click();
		//WebElement radio2 = rv.findElement(By.xpath(".//label[text()='Male' or @id='u_0_5_wA']"));
		WebElement radio2=rv.findElement(By.xpath("(//*[@class='_8esa'])[2]"));
		//WebElement radio2 = rv.findElement(By.xpath(".//label[text()='Male']"));
		radio2.click();
		Thread.sleep(2000);
		boolean value2 = radio1.isSelected();
		System.out.println(value2);
		Thread.sleep(2000);
		if (value2) {
			System.out.println("selected");
		} else {
			System.out.println("not selected");
		}
		rv.close();
		System.out.println("-------------------");
	}

}

/*
 * female radio //
 * rv.findElement(By.xpath(".//label[contains(text().'Female')]")); //
 * WebElement radio1 =rv.findElement(By.id("u_0_4_c9")); // WebElement radio1
 * =rv.findElement(By.xpath(".//input[@id='u_0_4_ch'])[1]")); //WebElement
 * radio1 = rv.findElement(By.xpath(".//input[@id='u_0_4_ch' or @value='1'"));
 * 
 * Male radio WebElement radio2 =rv.findElement(By.id("u_0_5_Vd")); //
 * WebElement radio2 =rv.findElement(By.xpath(".//input[@id='u_0_5_wA'])[1]"));
 * //WebElement radio2 =
 * rv.findElement(By.xpath(".//input[@id='u_0_5_wA' or @value='2']"));
 */
