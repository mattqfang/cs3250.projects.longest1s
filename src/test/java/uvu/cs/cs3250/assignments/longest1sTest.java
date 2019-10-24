package uvu.cs.cs3250.assignments;

import org.junit.Test;
import static org.junit.Assert.*;

public class longest1sTest {
	
	@Test
	public void test_0() {
		assertEquals(0, longest1s.findLongest1s(0));
	}
	
	@Test
	public void test_1() {
		assertEquals(1, longest1s.findLongest1s(1));
	}
	
	@Test
	public void test_2() {
		assertEquals(1, longest1s.findLongest1s(1));
	}
	
	@Test
	public void test_7() {
		assertEquals(3, longest1s.findLongest1s(7));
	}
	
	@Test
	public void test_14() {
		assertEquals(3, longest1s.findLongest1s(14));
	}
	
	@Test
	public void test_105() {
		assertEquals(2, longest1s.findLongest1s(105));
	}
	
	@Test
	public void test_127() {
		assertEquals(7, longest1s.findLongest1s(127));
	}
	
	@Test
	public void test_1021() {
		assertEquals(8, longest1s.findLongest1s(1021));
	}
	
	@Test
	public void test_Neg1() {
		assertEquals(32, longest1s.findLongest1s(-1));
	}
}
