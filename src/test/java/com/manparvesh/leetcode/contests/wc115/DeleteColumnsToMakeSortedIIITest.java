package com.manparvesh.leetcode.contests.wc115;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteColumnsToMakeSortedIIITest {

    @Test
    public void minDeletionSize() {
        DeleteColumnsToMakeSortedIII deleteColumnsToMakeSortedIII = new DeleteColumnsToMakeSortedIII();
        assertEquals(3, deleteColumnsToMakeSortedIII
                .minDeletionSize(new String[]{"babca","bbazb"}));

        assertEquals(4, deleteColumnsToMakeSortedIII
                .minDeletionSize(new String[]{"edcba"}));

        assertEquals(3, deleteColumnsToMakeSortedIII
                .minDeletionSize(new String[]{"babca","bbazb"}));
    }
}