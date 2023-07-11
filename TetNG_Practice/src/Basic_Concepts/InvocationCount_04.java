package Basic_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount_04 {

	/*
	 * InvocationCount will run method given count times
	 */
	@Test (invocationCount = 5)
	public void name() {
		Reporter.log("Hii from name",true);
	}
}
/*
 * 05) dependsOnMethods used to control the execution of test Methods
 * if  we write dependsOnMethods then, the methods execution depends on another method executions.
 * There are 4 types of it.
 * 1)simple level 2)multilevel 3)Hierarchy 4) Multiple
 */
