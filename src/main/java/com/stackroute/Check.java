package com.stackroute;
import java.util.Scanner;
public class Check {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=scanner.next().charAt(0);
            if (ch>='A' && ch<='Z')
            {
                System.out.println("Capital Letter");
            }
            else if(ch>='a' && ch<='z')
            {
                System.out.println("Small Letter");
            }
            else {
                System.out.println("Error");
        }
    }
}