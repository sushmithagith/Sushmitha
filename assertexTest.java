import static org.junit.Assert.*;
import org.junit.Test;
public class assertexTest {
	@Test
	public void isEmptytest() {
		assertTrue(isEmpty(""));
		assertFalse(isEmpty(" "));
		assertFalse(isEmpty("aiml-b"));
		assertFalse(isEmpty(" aiml-b "));
	}
	@Test
	public void isBlankTest()
	{
		assertTrue(isBlank(null));
		assertTrue(isBlank(""));
		assertFalse(isBlank("aiml-b"));
		assertTrue(isBlank(" "));
		assertFalse(isBlank(" aiml-b "));
		
	}

}
