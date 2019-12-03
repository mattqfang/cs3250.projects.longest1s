package longestOne;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestOneTest {

	private LongestOne longOne;
	
	@Before
	public void setUp() {
		longOne = new LongestOne();
	}
	
	@Test
	public void test0() {
		assertEquals(0, longOne.longestOne(0));
	}
	
	@Test
	public void test1() {
		assertEquals(1, longOne.longestOne(1));
	}

	@Test
	public void test2() {
		assertEquals(1, longOne.longestOne(2));
	}

	@Test
	public void test3() {
		assertEquals(2, longOne.longestOne(3));
	}

	@Test
	public void test4() {
		assertEquals(1, longOne.longestOne(4));
	}

	@Test
	public void test5() {
		assertEquals(1, longOne.longestOne(5));
	}

	@Test
	public void test6() {
		assertEquals(4, longOne.longestOne(752));
	}
}
