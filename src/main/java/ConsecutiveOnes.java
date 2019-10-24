class ConsecutiveOnes{
	public static void main(String[] args) {
		;
	}
	public int findLongest1s(int number){
		
		//declare variables
		String binaryForm;
		int i = 0;
		int largestSize = 0;
		int length = 0;
		
		//find the binary form of the number
		binaryForm =  java.lang.Integer.toBinaryString(number);
		length = binaryForm.length();
		
		//turn it into a char array
		char[] binaryArray = binaryForm.toCharArray();
		
		//iterate through every index and see how many 1's come after  
		//(if and only if the number itself is a 1),
		//count them, and keep the largest indexed.		
		while (i < length)
		{
			int n = i;
			int count = 0;
			
			//Check all but the last digit
			while (binaryArray[n] == '1'  && n < length - 1)
			{
				count++;
				n++;
			}
			
			//Check the last digit
			if (n == length - 1)
			{
				if (binaryArray[n] == '1')
				{
					count++;
				}
			}
			
			
			
			if (count > largestSize)
				{
					largestSize = count;
				}
			
			i++;
		}
		
		//return the largest.
		return largestSize;
	}
}
