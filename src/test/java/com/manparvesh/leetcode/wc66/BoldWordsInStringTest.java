package com.manparvesh.leetcode.wc66;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoldWordsInStringTest {
    @Test
    public void testBoldWords() {
        String[] words = new String[] { "ab", "bc" };
        String S = "aabcd";
        String actualAnswer = "a<b>abc</b>d";
        assertEquals(actualAnswer, new BoldWordsInString().boldWords(words, S));
    }

    @Test
    public void testBoldWords2(){
        String[] words = new String[]{"ccb","b","d","cba","dc"};
        String S = "eeaadadadc";
        String actualAnswer = "eeaa<b>d</b>a<b>d</b>a<b>dc</b>";
        assertEquals(actualAnswer, new BoldWordsInString().boldWords(words, S));
    }

    @Test
    public void testBoldWords3(){
        String[] words = new String[]{"e","cab","de","cc","db"};
        String S = "cbccceeead";
        String actualAnswer = "cb<b>ccceee</b>ad";
        assertEquals(actualAnswer, new BoldWordsInString().boldWords(words, S));
    }

}
