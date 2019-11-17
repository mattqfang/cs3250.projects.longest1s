package src;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestTest {

	@Test
	void testNoNumbers() {
		Longest test1 = new Longest(0);
		assertEquals(test1.getLongest(),0);
	}
	
	
	@Test
	void testOneOne() {
		Longest test3 = new Longest(1);
		assertEquals(test3.getLongest(),1);
	}
	
	@Test
	void testAllOnes() {
		Longest test4 = new Longest(7);
		assertEquals(test4.getLongest(),test4.input.length());
	}
	
	@Test
	void testVarLength() {
		Longest test5 = new Longest(5);
		assertEquals(test5.input.length(),3);
	}

}
