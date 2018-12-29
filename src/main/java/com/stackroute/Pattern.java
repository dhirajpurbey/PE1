package com.stackroute;
import java.util.Scanner;
public class Pattern
{
    public int[] patternCheck(int num,int length)
    {
        int k=0,i,j;
        int a[]=new int[length];
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                a[k]=i;
                k++;
            }
        }
        return a;
    }
}