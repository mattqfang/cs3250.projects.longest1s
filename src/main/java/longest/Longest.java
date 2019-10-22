// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package longest;

import java.util.ArrayList;
import java.util.List;

// https://uvu.instructure.com/courses/482395/assignments/4432315

// Given a number N. The task is to find the length of the longest consecutive 1s in its binary representation.
// Test case: Binary representation of 14 is 1110, in which 111 is the longest consecutive set bits and length is 3.
// The repository URL: https://github.com/mattqfang/cs3250.projects.longest1s.git

public class Longest {

    public static String convertToBinaryString(int n) {
        return Integer.toBinaryString(n);
    }

    public static List<String> getCharacterList(String inString) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < inString.length(); i++) {
            result.add(inString.substring(i));
        }
        return result;  
    }

    public static Long getLongestConsecutiveOnes(int n) {
        String word = convertToBinaryString(n);
        List<String> characters = getCharacterList(word);
        return characters.stream().parallel()
            .filter(c -> c.equals("1"))
            .count();
    }
    // String stringRepresentation = Integer.toBinaryString(int n)
    // 
}