package Basic_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_03 {
	/*
	 * If we not set Priority to mehtods ,methods will execute in alphabet order
	 * if we Priority to mehtods ,methods will execute according priority like 1,2,3
	 * 
	 * suppose if some methods priority are same then again it will flow AlphaBets..
	 */
	@Test (priority = 4)
	public void Add() {
		Reporter.log("Hii from Add",true);
	}
	
	@Test (priority = 3)
	public void edditAccount() {
		Reporter.log("Hii from edditAccount",true);
	}
	@Test (priority = 2)
	public void deleteAccount() {
		Reporter.log("Hii from deleteAccount",true);
	}
	@Test (priority = 1)
	public void createAccount() {
		Reporter.log("Hii from createAccount",true);
	}
	@Test (priority = 2)
	public void deleteBio() {
		Reporter.log("Hii from DeleteBio",true);
	}
}
