package uvu.cs.cs3250.assignments;
import java.security.InvalidParameterException;

public class Longest1s {

	public static int getLongest1s(int num) {

		int numOnes = 0;
		while (num!=0) {
			num = (num & (num << 1));
			numOnes++;
		}
		return numOnes;
	}

}
