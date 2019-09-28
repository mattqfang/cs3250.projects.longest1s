package uvu.cs.cs3250.assignments;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class LongestBinary1sTest {
	@Test
	public void testNumber1() {
		assertEquals(1, LongestBinary1s.getLongestBinary1s(1));
	}
	@Test
	public void testNumber234798() {
		assertEquals(3, LongestBinary1s.getLongestBinary1s(234798));
	}
	@Test
	public void testNumber111111111() {
		assertEquals(5, LongestBinary1s.getLongestBinary1s(111111111));
	}
	@Test
	public void testNumber0() {
		assertEquals(0, LongestBinary1s.getLongestBinary1s(0));
	}
	@Test
	public void testNumber123() {
		assertEquals(4, LongestBinary1s.getLongestBinary1s(123));
	}
	@Test
	public void testNumber2097151() {
		assertEquals(21, LongestBinary1s.getLongestBinary1s(2097151));
	}
	@Test
	public void testNumber16510399() {
		assertEquals(6, LongestBinary1s.getLongestBinary1s(16510399));
	}
	@Test
	public void testNumber512() {
		assertEquals(1, LongestBinary1s.getLongestBinary1s(512));
	}
}
