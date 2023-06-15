package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutiSelectedListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver rv = new ChromeDriver();
		rv.get("file:///C:/Users/admin/OneDrive/Desktop/API/HTML_Automation/ListBox.html");
		// identifying ListBox
		WebElement listBox = rv.findElement(By.id("list"));
		// create select class object
		Select s = new Select(listBox);
		// verify listbix is multiSelected or not
		if (s.isMultiple()) {
			System.out.println("ListBox is Multi Selected");
		} else {
			System.out.println("ListBox is Single Selected");
		}

	}

}
