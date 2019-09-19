package cs3250.projects.longest1s;

public class LongestConsecutiveOnes {

	public static int countConsecutiveBinaryOnesFromInt(int num) {
		if(num == 0)
			return 0;
		
		String binaryString = Integer.toBinaryString(num);
		
		if(!binaryString.contains("0")) {
			return binaryString.length();
		}
		
		String[] stringArray = binaryString.split("0");
		int maxLength = 0;
		
		for( String item : stringArray ) {
			if( item.length() > maxLength)
				maxLength = item.length();
		}
		return maxLength;
	}
}
