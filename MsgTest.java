import static org.junit.Assert.*;
import org.junit.Test;
public class MsgTest {
	String message="Hello";
	MsgUnit m=new MsgUnit(message);
	@Test
	public void test() {
		assertEquals(message,m.printmessage());
	}
}
