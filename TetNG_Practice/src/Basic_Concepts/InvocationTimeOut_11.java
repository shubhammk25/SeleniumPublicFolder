package Basic_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationTimeOut_11 {
	
	@Test (invocationTimeOut = 2000)
	public void m1() throws InterruptedException {
		Thread.sleep(5000);
		Reporter.log("Hello from m1 ",true);
	}

}
/*invocationTimeOut used to monitor method execution time
 * 
 * if method is not executed within timeout then method will be fail automatically
 * 
 */
