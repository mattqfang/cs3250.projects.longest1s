package uvu.cs.cs3250.assignments;

public class longest1s {
	
	public static int findLongest1s(int N) {
		String binaryRep = Integer.toBinaryString(N);
		int curLongest = 0;
		int startPos = 0;
		Boolean lastWas0 = true;
		
		for (int i = 0; i < binaryRep.length(); i++) {
			//If the current bit is a 1 and the last bit read wasn't a 1
			if (binaryRep.charAt(i) == '1' && lastWas0) {
				if (1 > curLongest) {
					curLongest = 1;
				}
				
				startPos = i;
				lastWas0 = false;
			}
			
			//If the current bit is a 1 and the last bit read was a 1
			else if (binaryRep.charAt(i) == '1' && !lastWas0) {
				curLongest++;
			}
			
			//If the current bit is a 0
			else {
				if ((startPos != i) && ((startPos - i + 1) > curLongest)) {
					curLongest = (startPos - i + 1);
				}
				lastWas0 = true;
			}
			
		}
		
		return curLongest;
	}
}