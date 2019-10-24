package test;

import static org.junit.Assert.assertEquals;

import project.Longest1s;
import org.junit.Test;

public class Longest1sTests {
    @Test
    public void test_number_23() {
        int x = 23;
        assertEquals("Original number: 23, Binary string: 10111, Longest sequence: 3 1's", Longest1s.findLongestChainOfOnes(x));
    }

    @Test
    public void test_number_0() {
        int x = 0;
        assertEquals("Original number: 0, Binary string: 0, Longest sequence: 0 1's", Longest1s.findLongestChainOfOnes(x));
    }

    @Test
    public void test_number_negative_1() {
        int x = -6;
        assertEquals("Original number: -6, Binary string: 11111111111111111111111111111010, Longest sequence: 29 1's", Longest1s.findLongestChainOfOnes(x));
    }

    @Test
    public void test_number_1000000() {
        int x = 1000000;
        assertEquals("Original number: 1000000, Binary string: 11110100001001000000, Longest sequence: 4 1's", Longest1s.findLongestChainOfOnes(x));
    }
}
