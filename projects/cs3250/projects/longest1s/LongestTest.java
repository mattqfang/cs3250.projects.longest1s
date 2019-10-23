package cs3250.projects.longest1s;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestTest {

	@Test
	public void LongestTestTest() {
		int num = 14;
		int longestOnes = LongestOnes.Longest(num);
		assertEquals(longestOnes, 3);
	}
}
