class longestOnes {
	public void main(String args[]) {
		
	}
	public int calcOnes(int data) {
		String lilBit = Integer.toBinaryString(data);
		int count = 0;
		int temp = 0;
		for(int i = 0; i < lilBit.length(); i++) {
			char val = lilBit.charAt(i);
			if(val == '1') {
				temp++;
				}
			else if(val == '0') {
				temp = 0;
			}
			if(temp > count) {
				count = temp;
				}
				
			}
		return count;
		
		
		
	}
}