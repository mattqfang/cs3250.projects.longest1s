package uvu.cs.cs3250.longest1s;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTests 
{	
	@Test public void test4Ones() { int shouldBeFour = Longest1s.FindLongestSequence(15); assertEquals(4, shouldBeFour); }
	
	@Test public void testAllOnes() { int shouldBeEight = Longest1s.FindLongestSequence(255); assertEquals(8, shouldBeEight); }
	
	@Test public void testTwoEqualLength() { int shouldBeThree = Longest1s.FindLongestSequence(231); assertEquals(3, shouldBeThree); }
	
	@Test public void testNoOnes() { int shouldBeZero = Longest1s.FindLongestSequence(0); assertEquals(0, shouldBeZero); }
	
	@Test public void testEveryOtherOne() { int shouldBeOne = Longest1s.FindLongestSequence(170); assertEquals(1, shouldBeOne); }
	
	@Test public void testNull() { int shouldBeZero = Longest1s.FindLongestSequence(null); assertEquals(0, shouldBeZero); }
	
	@Test public void testLargeNumber() { int shouldBeThree = Longest1s.FindLongestSequence(1000000000); assertEquals(3, shouldBeThree); }
}
