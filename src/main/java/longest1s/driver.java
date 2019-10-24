package longest1s;

import java.util.Scanner; // For user input using Scanner class and

public class driver {

	public static Integer main(String param) 
	{
		Integer reading = 0;
		if (param == null)
		{
			System.out.println("This program will accept an Integer and tell you the longest consectutive ones in its binary representation.\nPlease input a number: ");
			Scanner input = new Scanner(System.in);
			try 
			{
				reading = Integer.valueOf(input.nextLine()); 

			}
			catch(Exception e) 
			{
				System.out.println("This was an invalid input for the Interger receiving it. Program exiting.");
				input.close();
				return null;
			}
			input.close();
			if (reading == null) 
			{
				return null;
			}
		} 
		else 
		{
			reading = Integer.valueOf(param); //change the first parameter given to the program into an int.
		}
		System.out.println("[" + reading + "] is being assesed for its binary value.");
		return assessBinary(reading);
	}

	public static int assessBinary(Integer input) 
	{
		String binary = Integer.toBinaryString(input);
		System.out.println("The binary string is [" + binary + "].");
		int numberOfOnes = 0; // numberOfOnes is how many consecutive ones there are at most previously counted, it does not reset.
		int countingInt = 0; // countingInt is nonzero when the previous character is 1, but is otherwise a 0, and resets to zero once it sees a zero.
		String ones = "";
		for(int i = 0; i<binary.length(); ++i) 
		{
			if(binary.charAt(i) == '1')
			{
				++countingInt; 
				if (countingInt > numberOfOnes)
				{
					numberOfOnes = countingInt;
					ones += "1";
				}
			}
			else
			{
				countingInt = 0; // reseting to 0 to read separate cases.
			}
		}
		System.out.println("The most consecutive 1s is [" + numberOfOnes + "] as [" + ones + "].");
		return numberOfOnes;
				
	}
}
