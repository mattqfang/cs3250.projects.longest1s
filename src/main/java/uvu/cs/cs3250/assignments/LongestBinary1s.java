package uvu.cs.cs3250.assignments;

public class LongestBinary1s {
	
	public static int getLongestBinary1s(int number) {
		String binaryString = Integer.toBinaryString(number);
		
		int totalLongestConsecutive1sCount = 0;
		int currentConsecutive1sCount = 0;
		
		for(int i = 0; i < binaryString.length() ; i++) {
			if(binaryString.charAt(i) == '1') {
				currentConsecutive1sCount++;
				
				if(currentConsecutive1sCount > totalLongestConsecutive1sCount) {
					totalLongestConsecutive1sCount++;
				}
			} else {
				currentConsecutive1sCount = 0;
			}
		}
		
		return totalLongestConsecutive1sCount;
	}
}
