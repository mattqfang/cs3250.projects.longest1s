import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class longest1stest {
@Test
	public void testLongest() {
		assertEquals(4, longest1s.grouping(61));
	
}
@Test
	public void testZero() {
		assertEquals(0, longest1s.grouping(0));
	
}
@Test
	public void testReallyBig() {
		assertEquals(4, longest1s.grouping(1000000));
	
}
@Test
	public void test2OfSame() {
		assertEquals(2, longest1s.grouping(27));
	
}
@Test
	public void testNegative() {
		assertEquals(28, longest1s.grouping(-12));
	
}
}