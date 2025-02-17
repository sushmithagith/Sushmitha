package Testcase;
import static org.junit.Assert.*;
public class SubTest 
{
@Test
public void test()
{
	MainTest ob=new MainTest();
	int output_f=ob.Square(3);
	assertEquals(4,output_f);
}
}
