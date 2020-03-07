package com.cjdunteman.test;

import com.cjdunteman.main.CaesarsCipher;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarsCipherTest {

    private CaesarsCipher caesarsCipher = new CaesarsCipher();

    @Test
    public void testCipheredMessageWithOffset12() {
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", caesarsCipher.cipher("", 12));
    }
}