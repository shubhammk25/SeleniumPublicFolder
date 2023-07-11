package Basic_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExpectedException_12 {
	
	@Test (invocationTimeOut = 2000, expectedExceptions = ThreadTimeoutException.class)
	public void name() throws InterruptedException {
		Thread.sleep(4000);
		Reporter.log("Hii from name",true);
	}
	
	@Test ()
	public void name1() {
		
	}

}
