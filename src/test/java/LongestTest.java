import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class LongestTest {
    @Test
    public void test0() {
        assertEquals(0, Longest1s.longest1s(0));
    }
    @Test
    public void test1() {
        assertEquals(1, Longest1s.longest1s(1));
    }
    @Test
    public void test2() {
        assertEquals(1, Longest1s.longest1s(2));
    }
    @Test
    public void test3() {
        assertEquals(2, Longest1s.longest1s(3));
    }
    @Test
    public void test4() {
        assertEquals(1, Longest1s.longest1s(4));
    }
    @Test
    public void test6() {
        assertEquals(2, Longest1s.longest1s(6));
    }
    @Test
    public void test7() {
        assertEquals(3, Longest1s.longest1s(7));
    }
    @Test
    public void test15() {
        assertEquals(4, Longest1s.longest1s(15));
    }
    @Test
    public void test16() {
        assertEquals(1, Longest1s.longest1s(16));
    }
    @Test
    public void test30() {
        assertEquals(4, Longest1s.longest1s(30));
    }
    @Test
    public void test31() {
        assertEquals(5, Longest1s.longest1s(31));
    }
    @Test
    public void test32() {
        assertEquals(1, Longest1s.longest1s(32));
    }
    @Test
    public void test62() {
        assertEquals(5, Longest1s.longest1s(62));
    }
    @Test
    public void test63() {
        assertEquals(6, Longest1s.longest1s(63));
    }
    @Test
    public void test64() {
        assertEquals(1, Longest1s.longest1s(64));
    }
    @Test
    public void test1023() {
        assertEquals(10, Longest1s.longest1s(1023));
    }
    @Test
    public void test1024() {
        assertEquals(1, Longest1s.longest1s(1024));
    }
    @Test
    public void test1564534() {
        assertEquals(5, Longest1s.longest1s(1564534));
    }
} 
