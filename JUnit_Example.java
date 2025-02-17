import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit_Example {

	@Test
	public void test() {
		System.out.println("Check the string");
		String str="check the string";
		assertEquals("check the string",str);
	}

}