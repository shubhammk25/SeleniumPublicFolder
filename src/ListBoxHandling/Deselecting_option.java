package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselecting_option {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv = new ChromeDriver();
		Thread.sleep(3000);
		rv.get("file:///C:/Users/admin/OneDrive/Desktop/API/HTML_Automation/ListBox.html");
		// identifying ListBox
		WebElement listBox = rv.findElement(By.id("list"));Thread.sleep(3000);
		// create select class object
		Select s = new Select(listBox);Thread.sleep(3000);
		//select testing option
		List<WebElement> ref = s.getOptions();
		for (int i = 0; i < ref.size(); i++) {
			String string =ref.get(i).getText();
			if (string.contains("Testing")) {
				s.selectByVisibleText(string);
			}
			
		}
		Thread.sleep(2000);
		List<WebElement> ref1 = s.getAllSelectedOptions();
		for (int i = 0; i < ref1.size(); i++) {
			String txt = ref.get(i).getText();
			System.out.println(txt);
		}
		Thread.sleep(2000);
		s.deselectByVisibleText("SQL");
		Thread.sleep(2000);
		s.deselectAll();
	}

}
