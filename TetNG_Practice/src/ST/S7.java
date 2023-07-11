package ST;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class S7 {

	@Test (groups ="Valid")
	public void s7_m1() {
		Reporter.log("Hello from s7_m1 valid method");
	}
	@Test (groups ="InValid")
	public void s7_m2() {
		Reporter.log("Hello from s7_m2 Invalid method");
	}
}
