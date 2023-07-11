package Basic_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class TestAnnotation_aboveClass_02 {

	public void m1() {
		Reporter.log("Hello from m1 ",true);
	}
	public void m3() {
		Reporter.log("Hello from m3 ",true);
	}
	public void m2() {
		Reporter.log("Hello from m2 ",true);
	}
}