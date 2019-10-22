// I, Dallen Baldwin, assert that this source code was either written by myself
// or provided by my instructor. For all intents and purposes, it is original.

package longest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLongest {

    @Test
    public void checkForLength() {
        assertEquals(3, Longest.getLongestConsecutiveOnes(14));
    }

    @Test
    public void checkForConversion() {
        assertEquals("1110", Longest.convertToBinaryString(14));
    }

}