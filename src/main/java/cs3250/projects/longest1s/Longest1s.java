package cs3250.projects.longest1s;
public class Longest1s {
	public static String FindLongest1s(int N) {
		N = Math.abs(N);
		int ones = 0;
		int twos = (int)(Math.pow(2, (int)(Math.log(N)/Math.log(2))));
		int maxOnes = 0;
		String returnOnes = "";
		for (int j = twos; j >= 1; j /= 2) {
		    if (N >= j) {
		        N -= j;
		        ones += 1;
		        if (ones > maxOnes) returnOnes += "1";		    }
		    else {
		        ones = 0;
		    }
		    if (ones > maxOnes) maxOnes = ones;
		}
		return(returnOnes);
	}
}