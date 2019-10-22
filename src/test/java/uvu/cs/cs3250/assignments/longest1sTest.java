package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class longest1sTest {
	@Test
	public void test_14() {
		assertEquals(longest1s.ConsecutiveOnes(14), 3);
	}
	@Test
	public void test_53() {
		assertEquals(longest1s.ConsecutiveOnes(53), 2);
	}
	@Test
	public void test_10() {
		assertEquals(longest1s.ConsecutiveOnes(10), 1);
	}
}
