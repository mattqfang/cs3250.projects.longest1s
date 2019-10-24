package uvu.cs3250.longest;

public class Longest {

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
    public static void main(String[] args){
        int n = -673211;
        System.out.println(longest(n));
        System.out.println(longest(2147483647));
    }
}
