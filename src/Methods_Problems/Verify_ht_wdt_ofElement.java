package Methods_Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_ht_wdt_ofElement {
	public static void main(String[] args) {
		WebDriver rv=new ChromeDriver();
		rv.get("https://demo.actitime.com/login.do");
		rv.manage().window().maximize();
		WebElement un = rv.findElement(By.id("username"));
		WebElement pwd=rv.findElement(By.name("pwd"));
		
		int un_height=un.getRect().getHeight();
		System.out.println("un height"+un_height);
		int un_width=un.getRect().getWidth();
		System.out.println("un width"+un_width);
		int pwd_height=pwd.getRect().getHeight();
		System.out.println("pwd height"+pwd_height);
		int pwd_width=pwd.getRect().getWidth();
		System.out.println("pwd width"+pwd_width);
		if (un_height==pwd_height && un_width==pwd_width) {
			System.out.println("Height and Width are same");
		} else {
			System.out.println("Height and Width are not same");
		}
		
		int un_xloc=un.getRect().getX();
		System.out.println("Un xloc"+un_xloc);
		int un_yloc=un.getRect().getY();
		System.out.println("Un xloc"+un_yloc);
		int pwd_xloc=pwd.getRect().getX();
		System.out.println("Un xloc"+pwd_xloc);
		int pwd_yloc=pwd.getRect().getY();
		System.out.println("Un xloc"+pwd_yloc);
		
		if (pwd_xloc==un_xloc && pwd_yloc>un_yloc) {
			System.out.println("Allignment is same");
		} else {
			System.out.println("Allignment is not same");
		}
	}

}
