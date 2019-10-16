package longest1s;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLongestOneS {
	@Test
	public void testInt() {
		assertEquals(4, LongestOneS.Consectutive(15));
	}
	@Test
	public void testString() {
		assertEquals("6", LongestOneS.Consectutive("63"));
	}
	@Test
	public void testLargeInt() {
		assertEquals(3, LongestOneS.Consectutive(5486));
	}
	@Test
	public void testLargeString() {
		assertEquals("2", LongestOneS.Consectutive("5320"));
	}
	@Test
	public void testNull() {
		assertEquals("ERROR", LongestOneS.Consectutive(null));
	}
	@Test
	public void testEmpty() {
		assertEquals("ERROR", LongestOneS.Consectutive(""));
	}
	@Test
	public void testSpecialChar() {
		assertEquals("4", LongestOneS.Consectutive("%444/"));
	}
}