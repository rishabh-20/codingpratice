package com.company;
import java.util.Scanner;

public class Nestedforloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        float result=0;

        for (float i = 1; i < n; i++) {
            if (n % 2 == 0) {
                result -= 1;

            } else {
                result += 1;
            }

        }
        System.out.println(result);

    }


}
