package longestOne;

public class LongestOne {
	public int longestOne(Number n) {
		String bin = Integer.toBinaryString((int) n);
		int counter = 0;
		int record = 0;
		for(int i=0; i<bin.length(); i++) {
			char c = bin.charAt(i);
			if(c == '1') {
				counter++;
				if(counter > record) {
					record = counter;
				}
			}
			else {
				counter = 0;
			}
		}
		return record;
	}
}