package uvu.cs3250.longest;

public class Longest {

    //Function that reads an integer in and translates to binary.  Then it looks for longest string of 1's
    public static String longest(int num){
        String strNum = Integer.toBinaryString(num);
        int count = 0;
        for(int i = 0; i < strNum.length(); i++){
            if (strNum.charAt(i) != '1')
                continue;
            int charCount = 1;
            for (int j = i + 1; j < strNum.length(); j++){
                if (strNum.charAt(i) != strNum.charAt(j))
                    break;
                charCount++;
            }
            if (charCount > count)
                count = charCount;
        }
        return strNum + ": " + count;
    }
}
