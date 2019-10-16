package longest1s;

public class LongestOneS {
	public static int Consectutive(int num) {
		String binNum = Integer.toBinaryString(num);
		int count = 0;
		int click = 0;
		char[] bin = binNum.toCharArray();
		for(int i = 0; i < bin.length; i++) {
			if(bin[i] != '1') {
				count = 0;
			}
			else {
				count += 1;
				if (click <= count){
					click = count;
				}
			}
			
		}
		return click;
	}
	
	public static String Consectutive(String sNum) {
		if(sNum == null || sNum == "") {
			return "ERROR";
		}
		sNum = sNum.replaceAll("[^0-9]", "");
		int ber = Integer.parseInt(sNum);
		String sBinNum = Integer.toBinaryString(ber);
		int strikes = 0;
		int out = 0;
		char[] sBin = sBinNum.toCharArray();
		for(int i = 0; i < sBin.length; i++) {
			if(sBin[i] != '1') {
				strikes = 0;
			}
			else {
				strikes += 1;
				if (out <= strikes){
					out = strikes;
				}
			}
		}
		sNum = String.valueOf(out);
		return sNum;
		
	}
}
