package cs3250.projects.longest1s;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestConsecutiveOnesTest {
	@Test
	public void testNumber_0_LongestConsecutiveNumberOfOnes_0() {
		assertEquals(0, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(0));
	}
	
	@Test
	public void testNumber_14_LongestConsecutiveNumberOfOnes_3() {
		assertEquals(3, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(14));
	}
	
	@Test
	public void testNumber_2147483647_LongestConsecutiveNumberOfOnes_31() {
		assertEquals(31, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(2147483647));
	}
	
	@Test
	public void testNumber_239_LongestConsecutiveNumberOfOnes_4() {
		assertEquals(4, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(239));
	}
	
	@Test
	public void testNumber_235_LongestConsecutiveNumberOfOnes_3() {
		assertEquals(3, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(235));
	}
	
	@Test
	public void testNumber_341_LongestConsecutiveNumberOfOnes_1() {
		assertEquals(1, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(341));
	}
	
    @Test
	public void testNumber_2731_LongestConsecutiveNumberOfOnes_2() {
		assertEquals(2, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(2731));
	}
    
    @Test
	public void testNumber_Negative1_LongestConsecutiveNumberOfOnes_32() {
		assertEquals(32, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(-1));
	}
    
    @Test
	public void testNumber_Negative5_LongestConsecutiveNumberOfOnes_29() {
		assertEquals(29, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(-5));
	}
    
    @Test
	public void testNumber_Negative31_LongestConsecutiveNumberOfOnes_27() {
		assertEquals(27, LongestConsecutiveOnes.countConsecutiveBinaryOnesFromInt(-31));
	}
}
