package cs3250.projects.longest1s;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Longest1sTest {
	
	@Test
	public void testGetLongest_negativeNum() {
		assertEquals(0, Longest1s.getLongestRun(-10));
	}
	
	@Test
	public void testGetLongest_numFourteen() {
		assertEquals(3, Longest1s.getLongestRun(14));
	}
	
	@Test
	public void testGetLongest_numOneHundredOne() {
		assertEquals(2, Longest1s.getLongestRun(101));
	}
	
	@Test
	public void testGetLongest_num() {
		assertEquals(5, Longest1s.getLongestRun(31));
	}
	
}
