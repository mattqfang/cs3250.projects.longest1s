// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package longest;

// https://uvu.instructure.com/courses/482395/assignments/4432315

// Given a number N. The task is to find the length of the longest consecutive 1s in its binary representation.
// Test case: Binary representation of 14 is 1110, in which 111 is the longest consecutive set bits and length is 3.
// The repository URL: https://github.com/mattqfang/cs3250.projects.longest1s.git

public class Longest {
    public static int getLongestConsecutiveOnes(int n) {
        String word = convertToBinaryString(n); // convert number to binary representation
        String[] substrings = processWord(word); // get an array of substrings
        return getLongestSubstringLength(substrings); // return the length of the longest substring
    }

    public static String convertToBinaryString(int n) {
        return Integer.toBinaryString(n); // built in Integer function. super nice
    }

    public static int getLongestSubstringLength(String[] substrings) {
        int max = 0;
        for (String s : substrings) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

    public static String printLongestConsecutiveBits(int n) { // stupid, but fun
        int numOnes = getLongestConsecutiveOnes(n);
        String result = "";
        for (int i = 0; i < numOnes; i++) {
            result += "1";
        }
        return result;
    }

    public static String[] processWord(String word) {
        // we're working in binary so our lang = {1,0}
        // 00* works better than 0* because it splits on 1 or more consecutive 0's
        return word.split("00*"); 
    }


}