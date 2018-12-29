package com.stackroute;
import static org.junit.Assert.*;
import org.junit.Test;
public class PalindromeTest
{
    Palindrome palindrome= new Palindrome();
    @Test
    public void palindromeCheckTest1()
    {
        assertEquals(true,palindrome.palindromeCheck(12321));
    }
    @Test
    public void palindromeCheckTest2()
    {
        assertEquals(false, palindrome.palindromeCheck(12341));
    }
}