package calender_handling;
//handling target month and date in calender

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class targetMonth_02 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver rv = new ChromeDriver();
		rv.get("https://www.confirmtkt.com/");
		Thread.sleep(5000);
		WebElement tgt = rv.findElement(By.xpath(".//label[@for='dateOfJourney']"));
		tgt.click();
		Thread.sleep(5000);
		rv.findElement(By.id("dateOfJourney")).click();
		//tgt_month="September";
		Thread.sleep(5000);
		//selecting month
		while (true) {
			Thread.sleep(3000);
			// identifying displayed month
			String displayed_month = rv.findElement(By.xpath(".//div[contains(@class,'-switchHeader')]//p")).getText();
			if (displayed_month.contains("September")) {
				break;
			} else {
				rv.findElement(By.xpath(".//div[contains(@class,'-switchHeader')]//button[2]")).click();
			}

		}
		Thread.sleep(5000);
		//selecting date
		String tgt_date = "2";
		rv.findElement(By.xpath(".//div[contains(@class,'pickerView')]/div[2]//p[text()='"+tgt_date+"']")).click();
		//rv.close();

	}

}
