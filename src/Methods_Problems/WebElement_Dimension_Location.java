package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Dimension_Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		rv.manage().window().maximize();
		WebElement un = rv.findElement(By.id("username"));
		//by using GetSize()
		int un_height = un.getSize().getHeight();
		int un_width = un.getSize().getWidth();
		System.out.println("Element Height "+un_height);
		System.out.println("Element Width "+un_width);
		//By using GetLocation
		int un_xloc=un.getLocation().getX();
		int un_yloc=un.getLocation().getY();
		System.out.println("Element xloc "+un_xloc);
		System.out.println("Element yloc "+un_yloc);
		System.out.println("-------------------------------------");
		//By using GetRect()//gives both dimensions and location
		int un_height_01=un.getRect().getHeight();
		int un_width_01=un.getRect().getWidth();
		System.out.println("Element Height "+un_height_01);
		System.out.println("Element Width "+un_width_01);
		int un_xloc_01=un.getRect().getX();
		int un_yloc_01=un.getRect().getY();
		System.out.println("Element xloc "+un_xloc_01);
		System.out.println("Element yloc "+un_yloc_01);
	}

}
