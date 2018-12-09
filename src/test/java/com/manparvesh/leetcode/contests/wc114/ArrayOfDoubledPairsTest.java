package com.manparvesh.leetcode.contests.wc114;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfDoubledPairsTest {

    @Test
    public void canReorderDoubled() {
        ArrayOfDoubledPairs aodp = new ArrayOfDoubledPairs();
        assertEquals(false, aodp.canReorderDoubled(
                new int[] { 3, 1, 3, 6 }
        ));
        assertEquals(false, aodp.canReorderDoubled(
                new int[] { 2, 1, 2, 6 }
        ));
        assertEquals(true, aodp.canReorderDoubled(
                new int[] { 4, -2, 2, -4 }
        ));
        assertEquals(false, aodp.canReorderDoubled(
                new int[] { 1, 2, 4, 16, 8, 4 }
        ));
        assertEquals(true, aodp.canReorderDoubled(
                new int[] { 0, 0, 0, 0, 0, 0 }
        ));
    }
}