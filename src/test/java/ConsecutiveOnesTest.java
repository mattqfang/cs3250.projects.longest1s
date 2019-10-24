import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class ConsecutiveOnesTest {

	@Test
	public void fourteen() 
	{
		ConsecutiveOnes consec1 = new ConsecutiveOnes();
		int input = 14;
		int result = consec1.findLongest1s(input);
		assertEquals(3, result);
	}
	
	@Test
	public void One() 
	{
		ConsecutiveOnes consec1 = new ConsecutiveOnes();
		int input = 1;
		int result = consec1.findLongest1s(input);
		assertEquals(1, result);
	}

	@Test
	public void zero() 
	{
		ConsecutiveOnes consec1 = new ConsecutiveOnes();
		int input = 0;
		int result = consec1.findLongest1s(input);
		assertEquals(0, result);
		
	}
	
	@Test
	public void tenThousandOne() 
	{
		ConsecutiveOnes consec1 = new ConsecutiveOnes();
		int input = 100001;
		int result = consec1.findLongest1s(input);
		assertEquals(2, result);
	}
	
	@Test
	public void AllOnes() 
	{
		ConsecutiveOnes consec1 = new ConsecutiveOnes();
		int input = 255;
		int result = consec1.findLongest1s(input);
		assertEquals(8, result);
	}
	
	@Test
	public void VeryLargeNumber() 
	{
		ConsecutiveOnes consec1 = new ConsecutiveOnes();
		int input = 6481865;
		int result = consec1.findLongest1s(input);
		assertEquals(5, result);
	}
	

}



