package com.company;

import java.util.Scanner;
//check a number is palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverseNumber=0;
        while(temp>0){
            int LastDigit=temp%10;
            reverseNumber=reverseNumber*10+LastDigit;
            temp/=10;
        }
        if(reverseNumber==n){
            System.out.println(n+" Is Palindrome");
        }else{
            System.out.println(n+" Is not Palindrome");
        }

    }
}
