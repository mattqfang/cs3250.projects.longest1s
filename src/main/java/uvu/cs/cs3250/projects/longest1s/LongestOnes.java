package uvu.cs.cs3250.projects.longest1s;

public class LongestOnes {
    public int countConsecutiveOnes (int num) {
        int count = 0, tempCount = 0;
        boolean isOne = false;
        String binaryNum = Integer.toBinaryString(num);
        for (int i = 0; i < binaryNum.length(); i++) {
            char binaryDigit = binaryNum.charAt(i);

            if (binaryDigit == '1' && isOne) {
                tempCount++;
                if (tempCount > count) {
                    count = tempCount;
                }
            }
            else if (binaryDigit == '1' && !isOne) {
                isOne = true;
                tempCount++;
                if (tempCount > count) {
                    count = tempCount;
                }
            }
            else {
                isOne = false;
                tempCount = 0;
            }
        }
        return count;
    }
}
