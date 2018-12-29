package com.stackroute;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Range {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max = 50;
        int min = 1;
        int user_input;
       Random rand = new Random();
      int random_number = rand.nextInt(max) + 1;
        while (true) {
            System.out.println("Enter the number");
            user_input = sc.nextInt();
            if (user_input > random_number) {
                System.out.println("No Guess more than the original number");
          //      System.out.println(random_number);
            } else if (user_input < random_number) {
                System.out.println("No Guess less than the original number");
          //      System.out.println(random_number);
            } else {
                System.out.println("No Guess equal to the original number");
                break;
            }

        }
    }
}
