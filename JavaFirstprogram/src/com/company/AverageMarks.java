package com.company;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of student");
        int n= sc.nextInt();
        System.out.println("Enter Marks Now");

        int marks[]=new int[n];
        for(int i=0;i<n;i++){
            marks[i]= sc.nextInt();

        }
        int AverageMarks=0;
        for(int i=0;i<n;i++){
            AverageMarks+=marks[i];
        }
        AverageMarks /=n;
        System.out.println("The Average marks is "+AverageMarks);
    }
}
