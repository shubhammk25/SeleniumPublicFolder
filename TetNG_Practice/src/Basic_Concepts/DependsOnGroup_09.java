package Basic_Concepts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnGroup_09 {
	@Test (groups = "sample")
	public void m1() {
		Reporter.log("Hello from m1",true);
	}
	@Test (groups = "sample")
	public void m2() {
		//Assert.fail();
		Reporter.log("Hello from m2",true);
	}
	@Test (groups = "sample")
	
	public void m3() {
		Reporter.log("Hello from m3",true);
	}
	
	@Test (dependsOnGroups =  "sample")
	public void m4() {
		Reporter.log("Hello from m1",true);
	}

}
/*dependsOnGroup used to execution of method depends on group
 * if all methods of group are passed ,then only dependent method will execute otherwise skipped
 * 
 */
