package uvu.cs.cs3250.assignments;

public class longest1s {
	
	public static String long1s(int num) {
		
		String bin = Integer.toBinaryString(num);
		String[] binnum = bin.split("");
		String[] ones = new String[10];
		int count = 0, large = 0;
		
		for(int i = 0; i < bin.length(); i++) {
			
			if(binnum[i].equalsIgnoreCase("1"))
				count++;
			else
			{
				if(count > large)
				{
					large = count;
					count = 0;	
				}
			}
			
		}
		
		for(int i = 0; i < ones.length; i++) {
			
			if(i < large || i < count)
				ones[i] = "1";
			else
				ones[i] = "";
			
		}
		bin = String.join("", ones).trim();
		
		return bin;
		
	}
	
}