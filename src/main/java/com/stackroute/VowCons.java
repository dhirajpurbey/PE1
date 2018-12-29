package com.stackroute;
public class VowCons {
    public String vowelconsCheck(String str) {
        if(str.equals(str) && str.equals(null))
        {
            System.out.println("Enter String:");
        }
        else
        {

        }
        int len=str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
        if (ch >= A && ch <= Z  ) {
            if (ch = 'a' && ch = 'e' && ch = 'i' && ch = 'o' && ch = 'u' && ch = 'A' && ch = 'E' && ch = 'I' && ch = 'O' && ch = 'U') {
                String name = "vowel";
                return name;
            }
        }
        else  {
                String name1 = "consonant";
                return name1;
            }
            else
            return "Entered is not Alphabet";
        }
    }
}