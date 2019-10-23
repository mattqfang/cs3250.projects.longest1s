package uvu.cs.cs3250.longest1s;

public class Longest1s 
{
	public static int FindLongestSequence(Integer number)
	{
		// Test for null input and zero
		if (number == null || number == 0) { return 0; }
		
		// Turn the number into a binary sequence
		String binary = Integer.toBinaryString(number);
		
		// Split the string up into individual sequences of ones and initialize a counter
		String[] sequences = binary.split("0");
		int longest = 0;
		
		// Loop through the array of sequences of ones
		for (int i = 0; i < sequences.length; i++)
		{
			// Test if the current sequence is empty
			if (sequences[i].length() > 0)
			{
				// Initialize currentCount and set it equal to the length of the next sequence
				int currentCount = 0;
				
				// Loop through each sequence and count the number of ones
				for (int j = 0; j < sequences[i].length(); j++) { if(sequences[i].charAt(j) == '1') { currentCount++; }}
				
				// Test if the current sequence is longer than the current max
				// Assign count equal to the length of the current sequence if true
				if (currentCount > longest) { longest = currentCount; }
			}
		}
		
		// Return count of the longest sequence
		return longest;
	}
}
