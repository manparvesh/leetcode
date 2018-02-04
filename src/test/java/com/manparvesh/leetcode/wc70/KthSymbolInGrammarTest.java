package com.manparvesh.leetcode.wc70;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthSymbolInGrammarTest {

    @Test
    public void kthGrammar() {
        KthSymbolInGrammar kthSymbolInGrammar = new KthSymbolInGrammar();
        assertEquals(0, kthSymbolInGrammar.kthGrammar(1, 1));
        assertEquals(0, kthSymbolInGrammar.kthGrammar(2, 1));
        assertEquals(1, kthSymbolInGrammar.kthGrammar(2, 2));
        assertEquals(1, kthSymbolInGrammar.kthGrammar(3, 2));
        assertEquals(1, kthSymbolInGrammar.kthGrammar(4, 5));
    }
}