package com.cs3250.app;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class Longest1sTest {
	@Test
	public void testNullIisZero() {
		assertEquals(Longest1s.findLength(null), 0);
	}
	@Test
	public void testFourteenIsThree() {
		assertEquals(Longest1s.findLength(14), 3);
	}
	@Test
	public void testOneMillionIsFour() {
		assertEquals(Longest1s.findLength(1000000), 4);
	}
	@Test
	public void testZeroIsZero() {
		assertEquals(Longest1s.findLength(0), 0);
	}
	@Test
	public void testOneTheusandTwentyThreeIsTen() {
		assertEquals(Longest1s.findLength(1023), 10);
	}
}
