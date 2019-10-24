// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package longest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestLongest {
    @Test
    public void noOnes() { // 0
        int expected = 0;
        int actual = Longest.getLongestConsecutiveOnes(0);
        assertEquals(expected, actual);
    }

    @Test
    public void oneOnes() { // 1
        int expected = 1;
        int actual = Longest.getLongestConsecutiveOnes(1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void blocksOfOnesAndZeros() { // ‭11011101111001‬
        int expected = 4;
        int actual = Longest.getLongestConsecutiveOnes(14201);
        assertEquals(expected, actual);
    }

    @Test
    public void givenExample() { // 1110
        int expected = 3;
        int actual = Longest.getLongestConsecutiveOnes(14);
        assertEquals(expected, actual);
    }

    @Test
    public void checkConversion() {
        String expected = "1110";
        String actual = Longest.getBinaryString(14);
        assertEquals(expected, actual);
    }

    @Test
    public void checkWordProcessorEmpty() {
        String[] toList = {""};
        List<String> expected = Arrays.asList(toList);
        List<String> actual = Longest.getSubstrings("");
        assertEquals(expected, actual);
    }

    @Test
    public void checkWordProcessor() {
        String[] toList = {"11","1"};
        List<String> expected = Arrays.asList(toList);
        List<String> actual = Longest.getSubstrings("1100001");
        assertEquals(expected, actual);
    }
}