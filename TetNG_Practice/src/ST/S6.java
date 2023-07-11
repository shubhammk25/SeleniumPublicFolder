package ST;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class S6 {


	@Test (groups ="Valid")
	public void s6_m1() {
		Reporter.log("Hello from s6_m1 valid method");
	}
	@Test (groups ="InValid")
	public void s6_m2() {
		Reporter.log("Hello from s6_m2 Invalid method");
	}

}
