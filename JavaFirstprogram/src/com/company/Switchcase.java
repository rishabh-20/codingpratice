package com.company;
import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        int DayofWeek;
        System.out.println("Enter the Day");
        Scanner sc= new Scanner(System.in);
        DayofWeek = sc.nextInt();


        switch(DayofWeek){
            case 1:
                System.out.println("I AM AT office");
                break;
            case 2:
                System.out.println("I am playing");
                break;
            case 3:
                System.out.println("I am on leave");
                break;
            default:
                System.out.println("I am at home");



        }
    }
}
