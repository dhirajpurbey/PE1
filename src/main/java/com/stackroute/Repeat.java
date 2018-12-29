package com.stackroute;
import java.util.Scanner;
public class Repeat {
    public static void main(String args []) {
        String last;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String:");
        String str=sc.nextLine();
        System.out.println("Enter Any No:");
        int num=sc.nextInt();
        int len=str.length();
        last=str.substring(len-num);
        System.out.print(str+"");
        for(int i=0;i<num;i++)
        {
            System.out.print(last+"");
        }
    }
}