package uvu.cs.cs3250.assignments;


public class longest1s {
	public static void main(String[] args) {
		ConsecutiveOnes(53);
	}
	public static int ConsecutiveOnes(int n) {
		int number = n;
		String binaryN = "";
		while(number != 0) {
			if(number % 2 == 0) {
				binaryN = "0" + binaryN;
				//System.out.println("add 0");
			}
			else {
				binaryN = "1" + binaryN;
				//System.out.println("add 1");
			}
			number = number / 2;
		}
		//System.out.println(binaryN);
		int consecutiveCount = 0;
		int tempCount = 0;
		char[] charString = binaryN.toCharArray();
		//System.out.println(binaryN.length());
		for(int i = 0; i < binaryN.length(); i++) {
			if(charString[i] == '1') {
				tempCount++;
				//System.out.println("tempCount++");
			}
			if(charString[i] == '0' || i == (binaryN.length() - 1)){
				if(tempCount > consecutiveCount) {
					consecutiveCount = tempCount;
					tempCount = 0;
					//System.out.println("consecutiveCount = tempCount");
				}
			}
		}
		//System.out.println(consecutiveCount);
		return consecutiveCount;
	}
}
