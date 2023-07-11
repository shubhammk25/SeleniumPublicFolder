package Basic_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnotationOnMethods_01 {
	/*@Test Annotation is used to Run particular method
	 * Methods get Executed without main method
	 * @Test should be return above method
	 */
	@Test
	public void m1() {
		Reporter.log("Hello from m1 ",true);
	}
	@Test
	public void m3() {
		Reporter.log("Hello from m3 ",true);
	}
	@Test
	public void m2() {
		Reporter.log("Hello from m2 ",true);
	}
	@Test
	public void m4() {
		Reporter.log("Hello from m4 ",true);
	}

}
