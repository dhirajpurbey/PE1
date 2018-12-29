package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {
    EvenOdd evenodd=new EvenOdd();
    @Test
    public void evenoddCheckTest1()
    {
        assertEquals("Tom",evenodd.evenOddCheck(22));
    }
    @Test
    public void evenoddCheckTest2()
    {
        assertEquals("Jerry",evenodd.evenOddCheck(29));
    }
    @Test
    public void evenoddCheckTest3()
    {
        assertEquals("Not in Range",evenodd.evenOddCheck(98));
    }
}