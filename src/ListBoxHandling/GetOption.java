package ListBoxHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver rv = new ChromeDriver();
		Thread.sleep(3000);
		rv.get("file:///C:/Users/admin/OneDrive/Desktop/API/HTML_Automation/ListBox.html");
		// identifying ListBox
		WebElement listBox = rv.findElement(By.id("list"));Thread.sleep(3000);
		// create select class object
		Select s = new Select(listBox);Thread.sleep(3000);
		int listCount = s.getOptions().size();Thread.sleep(3000);
		System.out.println("Total options are present:- "+listCount);Thread.sleep(3000);
		System.out.println("--------------------------------------------");
		//print all option text as output
		List<WebElement> List_Text = s.getOptions();
		for (int i = 0; i <List_Text.size(); i++) {
			String Output = List_Text.get(i).getText();
			System.out.println(Output);
		}
		System.out.println("--------------------------------------------");
		Thread.sleep(3000);
		
		//select all option in the listbox
		for (int i = 0; i < List_Text.size(); i++) {
			s.selectByIndex(i);
		}
		Thread.sleep(3000);
		s.deselectAll();
		System.out.println("--------------------------------------------");
		//selecting only alternate
		for (int i = 0; i < List_Text.size(); i++) {
			if (i%2==1) {
				s.selectByIndex(i);
			}
		}
		Thread.sleep(3000);
		s.deselectAll();
		System.out.println("--------------------------------------------");
		//select only testing option
		for (int i = 0; i < List_Text.size(); i++) {
			 WebElement output = s.getOptions().get(i);
			 String testingText = output.getText();
			if (testingText.contains("Testing")) {
				s.selectByVisibleText(testingText);
			} 
		}
		s.deselectAll();
		Thread.sleep(3000);
		//alternate method for selecting Testing
		for (int i = 0; i < List_Text.size(); i++) {
			String output = listBox.getText();
			if (output.contains("Testing")) {
				s.selectByVisibleText(output);
			}
		}
	}

}
