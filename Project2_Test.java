package longest1s;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Project2_Test {

	@Test
	public void test_0() {
		assertEquals(Project2.longestLengthOfOnes(0), 0);
	}
	
	@Test
	public void test_1() {
		assertEquals(Project2.longestLengthOfOnes(1), 1);
	}
	
	@Test
	public void test_2() {
		assertEquals(Project2.longestLengthOfOnes(2), 1);
	}
	
	@Test
	public void test_67() {
		assertEquals(Project2.longestLengthOfOnes(67), 2);
	}
	
	@Test
	public void test_987654321() {
		assertEquals(Project2.longestLengthOfOnes(987654321), 4);
	}
	
	@Test
	public void test_999999999() {
		assertEquals(Project2.longestLengthOfOnes(999999999), 9);
	}
	
}
