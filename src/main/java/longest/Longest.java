// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package longest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// https://uvu.instructure.com/courses/482395/assignments/4432315

// Given a number N. The task is to find the length of the longest consecutive 1s in its binary representation.
// Test case: Binary representation of 14 is 1110, in which 111 is the longest consecutive set bits and length is 3.
// The repository URL: https://github.com/mattqfang/cs3250.projects.longest1s.git

public class Longest {
    public static int getLongestConsecutiveOnes(int n) {
        String word = getBinaryString(n); // convert number to binary representation
        List<String> substrings = getSubstrings(word); // get a list of substrings
        return getLengthLongestSubstring(substrings); // return the length of the longest substring
    }

    public static String getBinaryString(int n) {
        return Integer.toBinaryString(n); // built in Integer function. super convenient
    }

    public static int getLengthLongestSubstring(List<String> substrings) {
        return substrings.stream()
            .max(Comparator.comparing(String::length)) // compare the length of each to get the longest string
            .map(String::length) // map to the length value
            .orElse(0); // 0 if the string is empty : the longest is returned
        
        // also works but I want to show off my stream ;)

        // int max = 0;
        // for (String s : substrings) {
        //     if (s.length() > max) {
        //         max = s.length();
        //     }
        // }
        // return max;
    }

    public static List<String> getSubstrings(String word) {
        // we're working in binary so our lang = {1,0}
        // 00* works better than 0* because it splits on 1 or more consecutive 0's
        // return an array list so I can use a stream later
        return Arrays.asList(word.split("00*"));
    }


}