package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Google_location_search {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver rv=new ChromeDriver();Thread.sleep(3000);
		//search for wikipedia
		rv.get("https://www.wikipedia.org/");Thread.sleep(3000);
		//search pune in wikipedia
		rv.findElement(By.id("searchInput")).sendKeys("pune");Thread.sleep(3000);
		//clicks on search button
		rv.findElement(By.xpath(".//button[@type='submit']")).click();Thread.sleep(3000);
		//finds the location 
		WebElement location = rv.findElement(By.xpath("(.//a[@class='external text'])[1]"));Thread.sleep(3000);
		String text = location.getText();
		System.out.println(text);
		//goes to maps
		rv.navigate().to("https://www.google.com/maps");Thread.sleep(5000);
		//finds the search filed
		WebElement map_search = rv.findElement(By.xpath(".//input[@id='searchboxinput']"));
		//enter location
		map_search.sendKeys(text);Thread.sleep(5000);
		//click on search
		rv.findElement(By.id("hArJGc")).click();Thread.sleep(5000);
		//find starting point
		WebElement choose_start = rv.findElement(By.xpath("(.//input[@class='tactile-searchbox-input'])[1]"));
		Thread.sleep(5000);
		//enter starting location
		choose_start.sendKeys("solapur");Thread.sleep(5000);
		//clicks enter
		choose_start.sendKeys(Keys.ENTER);
		//rv.close();
		
	
	}

}
//*[@id="coordinates"]/span/span/a/span[1]/span
//span[@class='geo-dms']