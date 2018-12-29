package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowConsTest {
    VowCons vowcons= new VowCons();
    @Test
    public void vowelconsCheckTest1()
    {
        assertEquals("consonant",vowcons.vowelconsCheck('a'));
    }
    @Test
    public void vowelconsCheckTest2()
    {
        assertEquals("vowel",vowcons.vowelconsCheck('j'));
    }
    @Test
    public void vowelconsCheckTest3()
    {
        assertEquals("Error",vowcons.vowelconsCheck(5));
    }
}