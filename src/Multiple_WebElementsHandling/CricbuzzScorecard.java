package Multiple_WebElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzScorecard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver rv = new ChromeDriver();
		rv.get("https://www.cricbuzz.com/");
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//div[@class='cb-col-50 cb-ovr-flo cb-hmscg-tm-name'])[1]")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//a[@class='cb-nav-tab '])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> rows = rv.findElements(By.xpath(".//a[@class='cb-text-link']"));
		List<WebElement> runs = rv.findElements(By.xpath(".//div[@class='cb-col cb-col-8 text-right text-bold']"));
		for (int a = 0; a < 5; a++) {
			WebElement count = rows.get(a);
			String name = count.getText();
			WebElement run = runs.get(a + 1);
			String runs_1 = run.getText();
			System.out.println("Player name is : " + name + " || " + " His score is : " + runs_1);
		}
	}

}
