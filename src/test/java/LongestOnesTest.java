import org.junit.Test;
import uvu.cs.cs3250.projects.longest1s.LongestOnes;

import static org.junit.Assert.assertEquals;

public class LongestOnesTest {
    @Test
    public void testShortInput() {
        LongestOnes binaryNumber = new LongestOnes();
        int consecutive1sIn13 = binaryNumber.countConsecutiveOnes(13);
        assertEquals(2, consecutive1sIn13);
    }
    @Test
    public void testInput255() {
        LongestOnes binaryNumber = new LongestOnes();
        int consecutive1sIn255 = binaryNumber.countConsecutiveOnes(255);
        assertEquals(8, consecutive1sIn255);
    }
    @Test
    public void test2ConsecutiveOnesFirstLonger() {
        LongestOnes binaryNumber = new LongestOnes();
        int consecutive1sInNum = binaryNumber.countConsecutiveOnes(268433407);
        assertEquals(16, consecutive1sInNum);
    }
    @Test
    public void test2ConsecutiveOnesSecondLonger() {
        LongestOnes binaryNumber = new LongestOnes();
        int consecutive1sInNum = binaryNumber.countConsecutiveOnes(67100671);
        assertEquals(13, consecutive1sInNum);
    }
    @Test
    public void testLotsOfZeros() {
        LongestOnes binaryNumber = new LongestOnes();
        int consecutive1sInNum = binaryNumber.countConsecutiveOnes(50348981);
        assertEquals(3, consecutive1sInNum);
    }
    @Test
    public void testZero() {
        LongestOnes binaryNumber = new LongestOnes();
        int consecutive1sInNum = binaryNumber.countConsecutiveOnes(0);
        assertEquals(0, consecutive1sInNum);
    }
    @Test
    public void testTie() {
        LongestOnes binaryNumber = new LongestOnes();
        int consecutive1sInNum = binaryNumber.countConsecutiveOnes(21);
        assertEquals(1, consecutive1sInNum);
    }
    @Test
    public void testAllOnes() {
        LongestOnes binaryNumber = new LongestOnes();
        int consecutive1sInNum = binaryNumber.countConsecutiveOnes(2147483647);
        assertEquals(31, consecutive1sInNum);
    }
    @Test
    public void testNegativeNum() {
        LongestOnes binaryNumber = new LongestOnes();
        int consecutive1sInNum = binaryNumber.countConsecutiveOnes(-8);
        assertEquals(29, consecutive1sInNum);
    }


}
