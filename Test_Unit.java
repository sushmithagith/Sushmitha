import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Unit {
String message="hello world";
MsgUnit messageUtil=new MsgUnit(message);
	@Test
	public void test() {
		assertEquals(message,messageUtil.printmessage());
	}
}
