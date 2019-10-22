package cs3250.projects.longest1s;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Longest1sTest {
	@Test
	public void Testreturned1s_128() {
		String returned1s = Longest1s.FindLongest1s(128);
		assertEquals("1", returned1s);
	}
	@Test
	public void Testreturned1s_127() {
		String returned1s = Longest1s.FindLongest1s(127);
		assertEquals("1111111", returned1s);
	}
	@Test
	public void Testreturned1s_159159159() {
		String returned1s = Longest1s.FindLongest1s(159159159);
		assertEquals("11111", returned1s);
	}
	@Test
	public void Testreturned1s_0() {
		String returned1s = Longest1s.FindLongest1s(0);
		assertEquals("", returned1s);
	}
	@Test
	public void Testreturned1s_1234567890() {
		String returned1s = Longest1s.FindLongest1s(1234567890);
		assertEquals("11", returned1s);
	}
	@Test
	public void Testreturned1s_1073741823() {
		String returned1s = Longest1s.FindLongest1s(1073741823);
		assertEquals("111111111111111111111111111111", returned1s);
	}
	@Test
	public void Testreturned1s_SoMany1s() {
		String returned1s = Longest1s.FindLongest1s(111111111);
		assertEquals("11111", returned1s);
	}
	@Test
	public void Testreturned1s_Neg32() {
		String returned1s = Longest1s.FindLongest1s(-32);
		assertEquals("1", returned1s);
	}
	@Test
	public void Testreturned1s_MyBirthYear() {
		String returned1s = Longest1s.FindLongest1s(1990);
		assertEquals("11111", returned1s);
	}
	@Test
	public void Testreturned1s_101() {
		String returned1s = Longest1s.FindLongest1s(101);
		assertEquals("11", returned1s);
	}
}
