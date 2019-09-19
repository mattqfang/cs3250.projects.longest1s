package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Longest1sTest {
	
	@Test
	public void testZero() {
		assertTrue(Longest1s.getLongest1s(0) == 0);
	}
	@Test
	public void testRegularCase() {
		assertTrue(Longest1s.getLongest1s(14) == 3);
	}

	@Test
	public void testRegularCaseMed() {
		assertTrue(Longest1s.getLongest1s(140) == 2);
	}
	
	@Test
	public void testRegularNegCase() {
		assertTrue(Longest1s.getLongest1s(-19) == 27);
	}

	@Test
	public void testMaxCase() {
		assertTrue(Longest1s.getLongest1s(Integer.MAX_VALUE) == 31);
	}

	@Test
	public void testMinCase(){
		assertTrue(Longest1s.getLongest1s(Integer.MIN_VALUE) == 1);
	}
}
