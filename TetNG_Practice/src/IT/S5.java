package IT;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class S5 {

	@Test (groups ="Valid")
	public void s5_m1() {
		Reporter.log("Hello from s5_m1 valid method");
	}
	@Test (groups ="InValid")
	public void s5_m2() {
		Reporter.log("Hello from s5_m2 Invalid method");
	}
}
