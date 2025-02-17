package Testcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void test() {
		System.out.println("Check the string");
		String s="check the string";
		assertEquals("check the string",s);
	}

}
