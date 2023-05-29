package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_HTML_properties {

	public static void main(String[] args) {
		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		rv.manage().window().maximize();
		WebElement tgt_element = rv.findElement(By.id("keepLoggedInCheckBox"));
		String tagname = tgt_element.getTagName();
		System.out.println("Tag Name:- "+tagname);
		String Attribute = tgt_element.getAttribute("for");
		System.out.println("Attribute Name:-"+Attribute);
		String text = tgt_element.getText();
		System.out.println("Element text- "+text);
		rv.close();
		
	}
}
