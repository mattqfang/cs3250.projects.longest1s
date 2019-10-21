package com.cs3250.app;

public class Longest1s {
	public static int findLength (Integer n) {
		if (n == null) {
			return 0;
		}
		String binaryString = Integer.toString(n, 2);
		int max = 0;
		int current = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '0') {
				current = 0;
			} else if (binaryString.charAt(i) == '1') {
				current++;
				if (current > max) {
					max = current;
				}
			}
		}
		return max;
	}
}
