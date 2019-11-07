package uvu.cs.cs3250.assignments;

public class Longest1s {

  public static int getLongest1s(int num) {
   int curMax = 0;
   int numOnes = 0;

   String numInBinary = Integer.toBinaryString(num);
   for (char digit : numInBinary.toCharArray()) {
     if (digit == '1')
      ++numOnes;
     else
      numOnes = 0;
     curMax = (numOnes > curMax) ? numOnes : curMax;
   }

   return curMax;
  }
}
