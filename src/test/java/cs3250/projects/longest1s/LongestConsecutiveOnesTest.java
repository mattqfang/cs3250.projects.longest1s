package cs3250.projects.longest1s;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestConsecutiveOnesTest {
	private LongestConsecutiveOnes lco;
	
	@Before
	public void setUp() {
		lco = new LongestConsecutiveOnes();
	}
	@Test
	public void testNumber_0_LongestConsecutiveNumberOfOnes_0() {
		assertEquals(0, lco.countConsecutiveBinaryOnesFromInt(0));
	}
	
	@Test
	public void testNumber_14_LongestConsecutiveNumberOfOnes_3() {
		assertEquals(3, lco.countConsecutiveBinaryOnesFromInt(14));
	}
	
	@Test
	public void testNumber_Max_Value_LongestConsecutiveNumberOfOnes_31() {
		assertEquals(31, lco.countConsecutiveBinaryOnesFromInt(Integer.MAX_VALUE));
	}
	
	@Test
	public void testNumber_239_LongestConsecutiveNumberOfOnes_4() {
		assertEquals(4, lco.countConsecutiveBinaryOnesFromInt(239));
	}
	
	@Test
	public void testNumber_235_LongestConsecutiveNumberOfOnes_3() {
		assertEquals(3, lco.countConsecutiveBinaryOnesFromInt(235));
	}
	
	@Test
	public void testNumber_341_LongestConsecutiveNumberOfOnes_1() {
		assertEquals(1, lco.countConsecutiveBinaryOnesFromInt(341));
	}
	
    @Test
	public void testNumber_2731_LongestConsecutiveNumberOfOnes_2() {
		assertEquals(2, lco.countConsecutiveBinaryOnesFromInt(2731));
	}
}
