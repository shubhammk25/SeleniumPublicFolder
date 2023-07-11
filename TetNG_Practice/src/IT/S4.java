package IT;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class S4 {

	@Test (groups ="Valid")
	public void s4_m1() {
		Reporter.log("Hello from s4_m1 valid method");
	}
	@Test (groups ="InValid")
	public void s4_m2() {
		Reporter.log("Hello from s4_m2 Invalid method");
	}
}
