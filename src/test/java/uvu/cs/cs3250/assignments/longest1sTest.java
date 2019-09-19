package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class longest1sTest {
	
	@Test
	public void long1s_14() {
		assertEquals("111", longest1s.long1s(14));
	}
	
	@Test
	public void long1s_45() {
		assertEquals("11", longest1s.long1s(45));
	}
	
	@Test
	public void long1s_100() {
		assertEquals("11", longest1s.long1s(100));
	}
	
	@Test
	public void long1s_15() {
		assertEquals("1111", longest1s.long1s(15));
	}
	
	@Test
	public void long1s_0() {
		assertEquals("", longest1s.long1s(0));
	}
	
	@Test
	public void long1s_255() {
		assertEquals("11111111", longest1s.long1s(255));
	}
	
	
	
}