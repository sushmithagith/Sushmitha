package Testcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test3 {
	String message="hello";
	MsgUnit m=new m(message);
	@Test
	public void test() {
	assertEquals(message,m.test());	
		
	}

}
