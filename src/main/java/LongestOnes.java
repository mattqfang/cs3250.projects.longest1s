
public class LongestOnes {
    public static int LongestOnes(int n) {
        String binaryN = Integer.toBinaryString(n);
        int highestStreak = 0;
        int currentStreak = 0;

        for(int i = 0; i < binaryN.length(); i++){
            if(binaryN.charAt(i) == '1'){
                currentStreak++;
                if(currentStreak > highestStreak) highestStreak++;
            }
            else{
                currentStreak = 0;
            }
        }
        return highestStreak;
    }
}
