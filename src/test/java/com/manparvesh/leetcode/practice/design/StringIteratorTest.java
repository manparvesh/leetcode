package com.manparvesh.leetcode.practice.design;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringIteratorTest {
    @Test
    public void test(){
        String compressedString = "a1234567890b1234567890";
        StringIterator stringIterator = new StringIterator(compressedString);
        assertEquals('a', stringIterator.next());
        assertEquals('a', stringIterator.next());
        assertEquals('a', stringIterator.next());
        assertEquals('a', stringIterator.next());
        assertEquals('a', stringIterator.next());
        assertEquals('a', stringIterator.next());
        assertEquals('a', stringIterator.next());
        assertTrue(stringIterator.hasNext());
        assertEquals('a', stringIterator.next());
        assertTrue(stringIterator.hasNext());
    }
}