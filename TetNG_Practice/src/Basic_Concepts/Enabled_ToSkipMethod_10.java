package Basic_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_ToSkipMethod_10 {
	
	@Test (enabled=false)
	public void test02() {
		Reporter.log("Test03 execution",true);
	}
	@Test
	public void test01() {
		Reporter.log("Test01 execution",true);
	}
	@Test
	public void test03() {
		Reporter.log("Test03 execution",true);
	}

}
