package uvu.cs.cs3250.longest1s;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Longest1sTest {

	Longest1s test = new Longest1s();
	
	@Test
	public void testConvertToBinary_evenNumber() {		//check for even
		assertEquals("Failed", test.convertToBinary(4), "100");
	}
	
	@Test
	public void testConvertToBinary_oddNumber() {		//check for odd
		assertEquals("Failed", test.convertToBinary(15), "1111");
	}
	
	@Test
	public void testConvertToBinary_highEdge() {		//check for zero
		assertEquals("Failed", test.convertToBinary(0), "0");
	}
	
	@Test
	public void testConvertToBinary_lowEdge() {			//check for large number
		assertEquals("Failed", test.convertToBinary(64213), "1111101011010101");
	}
	
	
	@Test
	public void testFindLongestConsecutive_25() {		//general odd test
		assertEquals("Failed", test.findLongestConsecutive1(15), 4);
	}
	
	@Test
	public void testFindLongestConsecutive_134() {		//general even test
		assertEquals("Failed", test.findLongestConsecutive1(134), 2);
	}
	
	@Test
	public void testFindLongestConsecutive_490365() {		//tests with 4 consecutive then 5 follow to ensure correct count
		assertEquals("Failed", test.findLongestConsecutive1(490365), 5);
	}
	
	@Test
	public void testFindLongestConsecutive_32() {		//tests 1 one followed by zeros
		assertEquals("Failed", test.findLongestConsecutive1(32), 1);
	}
	
	@Test
	public void testFindLongestConsecutive_0() {		//tests zero
		assertEquals("Failed", test.findLongestConsecutive1(0), 0);
	}

}

