package Basic_Concepts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods_Simple_05 {
	
	@Test
	public void test01() {
		Assert.fail();//used to fail method
		Reporter.log("Test01 execution",true);
	}
	@Test (dependsOnMethods = "test01")
	public void test02() {
		Reporter.log("Test02 execution",true);
	}


}
