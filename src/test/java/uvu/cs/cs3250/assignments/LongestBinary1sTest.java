package uvu.cs.cs3250.assignments;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class LongestBinary1sTest {
	@Test
	public void testDetermineWinner_null() {
		assertEquals(1, LongestBinary1s.getLongestBinary1s(1));
	}
	
}
