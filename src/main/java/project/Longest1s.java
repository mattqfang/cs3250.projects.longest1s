package project;


public class Longest1s {

    public static String findLongestChainOfOnes(int x) {

        // move given int to binary string
        String binStr = Integer.toBinaryString(x);
        // declare constants and variables
        int count = 0;
        int total1s = 0;
        final int NEXT = 1;
        int arrLen = binStr.length();

        for(int i = 0; i < arrLen; i++){

            char pos = binStr.charAt(i);
            if (pos == '1')
            {
                // 1 exists, increase count
                count++;
                for (int j = i + NEXT; j < binStr.length(); j++){
                    char nextPos = binStr.charAt(j);
                    // break chain if 0
                    if (pos != nextPos)
                        break;
                    // increment
                    count++;
                }
                // check for new longest sequence
                if (count > total1s)
                    total1s = count;

                // reset count
                count = 0;
            }
        }
        // return original number, binary string and longest sequence of 1's
        return "Original number: " + x + ", Binary string: " + binStr + ", Longest sequence: " + total1s + " 1's";

    }

}
