package JUnit-1;
import static org.JUnit.Assert;
import org.junit.Text;
public class JUnitExample {
@Test
	public void test_JUnit()
	{
	System.out.println("Check the string");
	String str="check the string";
	assertEquals("check the string",str);
	}
}
