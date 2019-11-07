package cs3250.projects.longest1s;

public class LongestConsecutiveOnes {
	
	public int countConsecutiveBinaryOnesFromInt(int num) {		
		String binaryString = Integer.toBinaryString(num);
		String[] stringArray = binaryString.split("0");
		int maxLength = 0;
		
		for( String item : stringArray ) {
			if( item.length() > maxLength)
				maxLength = item.length();
		}
		return maxLength;
	}
}
