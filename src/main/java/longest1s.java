public class longest1s {
    public static int grouping(int input) {
        String converted = Integer.toBinaryString(input);
        String broke[] = converted.split("", 0);
        int count = 0;
        int max = 0;
        for (String dig : broke){
            if(dig.equals("1")){
                count++;
            }
            if(dig.equals("0")){
                if(count > max){
                    max = count;
                }
                 count = 0;

            }
            if (count > max){
                max = count;
            }
        }

        return max;
    }
}
    