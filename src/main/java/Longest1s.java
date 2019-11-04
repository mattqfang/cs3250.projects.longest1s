public class Longest1s {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(longest1s(i));
        }
        System.out.println(longest1s(15));
        System.out.println(longest1s(127));
        System.out.println(longest1s(150));
    }


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
