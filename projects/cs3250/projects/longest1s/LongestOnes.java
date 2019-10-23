package cs3250.projects.longest1s;

import java.util.Scanner;

public class LongestOnes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input number: ");
		
		int num = Integer.parseInt(s.nextLine());
		
		int longest = Longest(num);
		
		System.out.println("Longest consecutive 1s: " + longest);
		
		s.close();
	}
	
	public static int Longest(int num) {
		String bin = Integer.toBinaryString(num);
		int longest = 0;
		int finalLongest = 0;
		
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '1') {
				longest++;
			}
			else {
				if (longest > finalLongest) {
					finalLongest = longest;
				}
				
				longest = 0;
			}
		}
		
		return finalLongest == 0 ? longest : finalLongest;
	}

}
