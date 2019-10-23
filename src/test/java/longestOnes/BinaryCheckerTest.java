package longestOnes;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryCheckerTest {

	@Test
	public void longestOnesTest() {
		assertEquals(3, BinaryChecker.longestOnes(14));
		assertEquals(0, BinaryChecker.longestOnes(0));
		assertEquals(1, BinaryChecker.longestOnes(1));
		
		// arbitarily long number
		assertEquals(2, BinaryChecker.longestOnes(9000));
		assertEquals(4, BinaryChecker.longestOnes(9999));
		
		// All 1s
		assertEquals(8, BinaryChecker.longestOnes(255));
		assertEquals(32, BinaryChecker.longestOnes(-1));
		assertEquals(31, BinaryChecker.longestOnes(-2));
		assertEquals(18, BinaryChecker.longestOnes(-9999));
	}

}
