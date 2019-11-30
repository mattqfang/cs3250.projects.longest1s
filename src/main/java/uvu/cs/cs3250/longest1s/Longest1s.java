package uvu.cs.cs3250.longest1s;

public class Longest1s {

	public String convertToBinary(int userNum) {	//does simple conversion of int to binary for use in primary method
		String binaryString;
		
		binaryString = Integer.toBinaryString(userNum);
		
		return binaryString;
		
		
	}
	
	public int findLongestConsecutive1(int userNum) {	//primary method takes int int and returns max num of consecutive 1s
		int longest1s = 0;
		int tempLongest = 0;
		
		String targetString = convertToBinary(userNum);
		
		for (int i = 0; i < targetString.length(); i++) {
			if (targetString.charAt(i) == '1') {
				tempLongest += 1;
			}
			else if (targetString.charAt(i) == '0' && tempLongest > longest1s) {	//if 0 is reached it updates longest1s if
				longest1s = tempLongest;											//less than tempLongest 
				tempLongest = 0;
			}
			else {
				tempLongest = 0;
			}
			
		}
		
		if(tempLongest > longest1s) {		//updates longest1s with tempLongest in case binary string ends in 1s
			longest1s = tempLongest;
		}
		
		return longest1s;
	}
}
