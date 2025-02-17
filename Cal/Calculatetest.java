package Cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculatetest {
	Calculate calculation=new Calculate();
    int sum=calculation.sum(10,5);
    int testsum=15;
	@Test
	public void test() {
		System.out.println("@Testsum():"+sum+"="+testsum);
		assertEquals(sum,testsum);
	}
}
