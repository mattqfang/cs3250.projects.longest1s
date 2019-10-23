package longestOnes;

import java.util.stream.Stream;

public class BinaryChecker {
	public static int longestOnes(int num) {
		return Stream.of(
				Integer.toBinaryString(num)
				.split("0"))
				.map(String::length)
				.max(Integer::compareTo)
				.orElseGet(() -> 0);
	}
}
