package com.stackroute;
import java.util.*;
public class Palindrome {
    public static boolean palindromeCheck(int num) {
        int rev, temp;
        temp = num;
        rev = 0;
        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        if (num == rev)
            return true;
        else
            return false;
    }
}