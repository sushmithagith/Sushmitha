package Testcase;
import static org.junit.Assert.*;
import org.junit.Test;
public class TEST1 {
	@Test
	public void test() {
		MainTest ob=new MainTest();
		int output_f=ob.Square(3);
		assertEquals(9,output_f);
	}
}
