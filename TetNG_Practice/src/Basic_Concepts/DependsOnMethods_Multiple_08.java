package Basic_Concepts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods_Multiple_08 {
	
	@Test
	public void test01() {
		
		Reporter.log("Test01 execution",true);
	}
	@Test 
	public void test02() {
		
		Reporter.log("Test02 execution",true);
	}
	@Test (dependsOnMethods = {"test01","test02"})
	public void test03()
	{
		Assert.fail();
		Reporter.log("Test03 execution",true);
	}


}
