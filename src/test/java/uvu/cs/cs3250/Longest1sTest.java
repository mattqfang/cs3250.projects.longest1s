package uvu.cs.cs3250;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Longest1sTest {
	@Test
	public void Test13() {
		assertTrue(Longest1s.ConsecutiveOnesCount(13) == 2);
	}
	
	@Test
	public void Test891()
	{
		assertTrue(Longest1s.ConsecutiveOnesCount(891) == 4);
	}
	
	@Test
	public void Test14()
	{
		assertTrue(Longest1s.ConsecutiveOnesCount(14) == 3);
	}
}