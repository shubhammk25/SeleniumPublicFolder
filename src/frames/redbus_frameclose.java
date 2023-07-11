package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus_frameclose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver rv=new ChromeDriver();
		rv.get("https://www.redbus.in/");Thread.sleep(3000);
		rv.findElement(By.xpath(".//span[contains(text(),'Account')]")).click();Thread.sleep(3000);
		rv.findElement(By.xpath(".//span[contains(.,'Login/ Sign Up')]")).click();Thread.sleep(7000);
		WebElement loginframe = rv.findElement(By.xpath(".//iframe[@class='modalIframe']"));Thread.sleep(3000);
		rv.switchTo().frame(loginframe);Thread.sleep(3000);
		rv.findElement(By.id("mobileNoInp")).sendKeys("1234567899");Thread.sleep(3000);
		rv.close();
	}

}
