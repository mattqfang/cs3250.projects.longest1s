package cs3250.projects.longest1s;

public class Longest1s {
	public static int getLongestRun(int num) {
		if(num < 0) {
			return 0;
		}
		String binaryNum = Integer.toBinaryString(num);
		System.out.println(binaryNum);
		int numberOfOnes = 0;
		int maxNumberOfOnes = 0;
		for(int i = 0; i < binaryNum.length(); i++) {
			if(binaryNum.charAt(i) == '1') {
				numberOfOnes++;
				if(numberOfOnes > maxNumberOfOnes) {
					maxNumberOfOnes = numberOfOnes;
				}
			}
			else {
				numberOfOnes = 0;
			}
		}
		return maxNumberOfOnes;
	}
}
