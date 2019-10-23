// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package longest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLongest {
    @Test
    public void checkForLength0() { // 0
        int expected = 0;
        int actual = Longest.getLongestConsecutiveOnes(0);
        assertEquals(expected, actual);
    }

    @Test
    public void checkForLength1() { // 1
        int expected = 1;
        int actual = Longest.getLongestConsecutiveOnes(1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void checkForLength2() { // ‭100010011001‬
        int expected = 2;
        int actual = Longest.getLongestConsecutiveOnes(2201);
        assertEquals(expected, actual);
    }

    @Test
    public void checkForLength3() { // 1110
        int expected = 3;
        int actual = Longest.getLongestConsecutiveOnes(14);
        assertEquals(expected, actual);
    }

    @Test
    public void checkForLength4() { // ‭11011101111001‬
        int expected = 4;
        int actual = Longest.getLongestConsecutiveOnes(14201);
        assertEquals(expected, actual);
    }
     
    @Test
    public void checkForLength5() { // ‭1011111‬
        int expected = 5;
        int actual = Longest.getLongestConsecutiveOnes(95);
        assertEquals(expected, actual);
    }

    @Test
    public void checkPrinting() {
        String expected = "1111";
        String actual = Longest.printLongestConsecutiveBits(14201);
        assertEquals(expected, actual);
    }

    @Test
    public void checkForConversion() {
        String expected = "1110";
        String actual = Longest.convertToBinaryString(14);
        assertEquals(expected, actual);
    }

    @Test
    public void checkWordProcessorEmpty() {
        String[] expected = {""};
        String[] actual = Longest.processWord("");
        assertEquals(expected, actual);
    }

    @Test
    public void checkWordProcessor() {
        String[] expected = {"11","1"};
        String[] actual = Longest.processWord("1100001");
        assertEquals(expected, actual);
    }
}