package uvu.cs.cs3250.assignments.Longest;

public class Longest1s {

    public static int longest1s(int input) {
        String binary = Integer.toBinaryString(input);
        int longest = -1;
        int current = 0;
        for (char bit : binary.toCharArray()) {
            if (Character.compare(bit, '1') == 0) {
                current += 1;
            } else {
                if (longest < current) {
                    longest = current;
                }
                current = 0;
            }
        }
        if (longest < current) {
            longest = current;
        }

        return longest;
    }
} 
