package uvu.cs.cs3250;

public class Longest1s {

	public static int ConsecutiveOnesCount(int num)
	{
		int toret = 0;
		int currentStreak = 0;
		String binary = Integer.toBinaryString(num);
		for (int i = 0; i < binary.length(); i++)
		{
			if (binary.charAt(i) == '1')
			{
				currentStreak++;
			}
			if (binary.charAt(i) == '0')
			{
				if (currentStreak > toret)
				{
					toret = currentStreak;
				}
				currentStreak = 0;
			}
		}
		return toret;
	}
}