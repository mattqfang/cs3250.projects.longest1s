import static org.junit.Assert.*;

import org.junit.Test;

public class longestOnesTest {

	@Test
	public void fourteenTest() {
		longestOnes test = new longestOnes(); 
		int data = 14;
		int result = test.calcOnes(data);
		assertEquals(3, result);
	}
	
	@Test
	public void oneHundredThousandsTest() {
		longestOnes test = new longestOnes(); 
		int data1 = 100000;
		int result = test.calcOnes(data1);
		assertEquals(2, result);
	}

	@Test
	public void twoFiftySixTest() {
		longestOnes test = new longestOnes(); 
		int data2 = 255;
		int result = test.calcOnes(data2);
		assertEquals(8, result);
	}
}