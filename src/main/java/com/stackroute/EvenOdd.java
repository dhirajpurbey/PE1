package com.stackroute;
public class EvenOdd {
    public String evenOddCheck(int num) {
        if (num >= 20 && num <= 30) {
            if ((num % 2) != 0) {
                String name = "Jerry";
                return name;
            } else {
                String name1 = "Tom";
                return name1;
            }
        }
        else {
            return "Not in Range";
        }
    }
}