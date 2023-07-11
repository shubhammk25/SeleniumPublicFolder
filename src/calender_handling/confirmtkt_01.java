package calender_handling;
//handling current date
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmtkt_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver rv=new ChromeDriver();
		rv.get("https://www.confirmtkt.com/");
		Thread.sleep(7000);
//		Thread.sleep(7000);
		WebElement tgt = rv.findElement(By.xpath(".//label[@for='dateOfJourney']"));
		Thread.sleep(7000);
		JavascriptExecutor js=(JavascriptExecutor)rv;
		Thread.sleep(7000);
		js.executeScript("arguments[0].click()", tgt);
		Thread.sleep(7000);
		rv.findElement(By.id("dateOfJourney")).click();
		rv.findElement(By.xpath(".//button[contains(@class,'current')]")).click();
		Thread.sleep(3000);
		rv.close();
	}

}
/*In above code need  to find element two times because the page is going refresh ,and because of that html code is geeting change
 * so need to find element two times..
 * 
 */
