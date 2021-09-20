package com.company;

import java.util.Scanner;

public class Whileloops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;

        while(temp>0){
            int LastDigit=temp%10;
            temp/=10;
            sum+=LastDigit;


        }
        System.out.println("The sum of digit of "+ n +" is "+ sum);


    }
}
