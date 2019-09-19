package cs3250.projects.longest1s;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Longest1sTest {
	@Test
	public void testGetLongest() {
		assertEquals(0, Longest1s.getLongestRun(1));
	}
	
}
