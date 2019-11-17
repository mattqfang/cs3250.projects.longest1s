package src;

public class Longest  {
	String input;
	int count;
	int longest;
	boolean stretch;
	
	public Longest(int n) {
		this.input = Integer.toBinaryString(n);
		count = 0;
		longest = 0;
		stretch = false;
	}
		
	private void calcLongest() {
		for (int i=0; i<input.length(); i++){
// circle through the string looking for a one.
			char temp = input.charAt(i);
			//when I find a one 
				if (temp == '1') {
				//flip the switch on
					stretch = true;
				//increment count.
					count ++;
				//if count is greater than longest,
					if (count> longest) {
					//longest = count;
						longest = count;
					}
				}else {
				//flip the switch off
					stretch = false;
				//set count to zero
					count = 0;
				}
		}
	}
	
	public int getLongest() {
		this.calcLongest();
		return longest;
	}
}
