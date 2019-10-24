package uvu.cs3250.longest;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestTest {
    @Test
    public void testNum3() {
        String expected = Integer.toBinaryString(3) + ": " + 2;
        String result = Longest.longest(3);

        assertEquals(expected, result);
    }
    @Test
    public void testNum0() {
        String expected = Integer.toBinaryString(0) + ": " + 0;
        String result = Longest.longest(0);

        assertEquals(expected, result);
    }
    @Test
    public void testMediumNum8675309() {
        String expected = Integer.toBinaryString(8675309) + ": " + 8;
        String result = Longest.longest(8675309);

        assertEquals(expected, result);
    }
    @Test
    public void testMaxInt() {
        String expected = Integer.toBinaryString(2147483647) + ": " + 31;
        String result = Longest.longest(2147483647);

        assertEquals(expected, result);
    }
    @Test
    public void testCharA() {
        String expected = Integer.toBinaryString('A') + ": " + 1;
        String result = Longest.longest('A');

        assertEquals(expected, result);
    }
}
