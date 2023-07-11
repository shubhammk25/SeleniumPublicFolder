package Basic_Concepts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods_Hirararchy_07 {
	
	@Test
	public void test01() {
		Assert.fail();
		Reporter.log("Test01 execution",true);
	}
	@Test (dependsOnMethods = "test01")
	public void test02() {
		
		Reporter.log("Test02 execution",true);
	}
	@Test (dependsOnMethods = "test01")
	public void test03()
	{
		Reporter.log("Test03 execution",true);
	}

}
