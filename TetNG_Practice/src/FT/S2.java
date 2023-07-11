package FT;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class S2 {
	
	@Test (groups ="Valid")
	public void s2_m1() {
		Reporter.log("Hello from s2_m1 valid method");
	}
	@Test (groups ="Valid")
	public void s2_m2() {
		Reporter.log("Hello from s2_m2 valid method");
	}
	@Test (groups ="InValid")
	public void s2_m3() {
		Reporter.log("Hello from s2_m3 Invalid method");
	}
	

}
