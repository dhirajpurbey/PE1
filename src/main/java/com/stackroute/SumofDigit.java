package com.stackroute;
import java.util.Scanner;
public class SumofDigit {
    public static void main(String args[]) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        while(num != -1){
            sum = sum + num;
            num = sc.nextInt();
        }
        System.out.println("Sum of all the integer is:" + " "+sum);
    }
}