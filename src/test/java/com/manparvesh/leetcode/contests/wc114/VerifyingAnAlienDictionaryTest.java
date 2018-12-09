package com.manparvesh.leetcode.contests.wc114;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerifyingAnAlienDictionaryTest {

    @Test
    public void isAlienSorted() {
        VerifyingAnAlienDictionary verifyingAnAlienDictionary = new VerifyingAnAlienDictionary();

        String[] sar = new String[] { "hello", "leetcode" };
        assertEquals(true, verifyingAnAlienDictionary.isAlienSorted(
                sar,
                "hlabcdefgijkmnopqrstuvwxyz"
        ));
        assertEquals(false, verifyingAnAlienDictionary.isAlienSorted(
                new String[]{"word","world","row"},
                "worldabcefghijkmnpqstuvxyz"
        ));
        assertEquals(false, verifyingAnAlienDictionary.isAlienSorted(
                new String[]{"apple","app"},
                "abcdefghijklmnopqrstuvwxyzv"
        ));
    }
}