// Project: Longest Consecutive Ones
// Name: Ryan Trujillo

package cs3250.projects.longest1s;

import java.util.Scanner;

public class LongestOnes {

	public static void main(String[] args) {
		System.out.println("Longest Consecutive Ones");
		System.out.print("Please input a number: ");
		
		Scanner inStream = new Scanner(System.in);
		int input = Integer.parseInt(inStream.nextLine());
		
		int longestString = findConsecutiveOnes(input);
		
		System.out.println("The binary representation of the number you entered is: "
				+ Integer.toBinaryString(input));
		System.out.println("The longest consecutive string of ones is of length: "
				+ longestString);
		inStream.close();

	}
	
	public static int findConsecutiveOnes(int number) {
		String binary = Integer.toBinaryString(number);
		int longest = 0;
		int currentCount = 0;
		for (char c : binary.toCharArray()) {
			if (Character.compare(c, '1') == 0) {
				++currentCount;
				if (currentCount > longest)
					longest = currentCount;
			} else {
				currentCount = 0;
			}
		}
		return longest;
	}

}
