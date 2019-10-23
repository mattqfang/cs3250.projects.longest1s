package longest1s;

public class Project2 {
	public static void main(String[] args) {
		int ones = longestLengthOfOnes(999999999);
		System.out.println("Longest length of ones: " + ones);
		
	}
	
	public static int longestLengthOfOnes(int value) {
		char[] binArray = Integer.toBinaryString(value).toCharArray();
		System.out.print("Binary representation of " + value + ": ");
		System.out.println(binArray);
		
		int longest = 0;
		int count = 0;
		
		for(int i = 0; i < binArray.length; i++) {
			if(binArray[i] == '1') {
				count++;
			}
			else {
				if(count > longest) {
					longest = count;
				}
				count = 0;
			}
		}
		if(count > longest) {
			longest = count;
		}
		return longest;
	}

}
