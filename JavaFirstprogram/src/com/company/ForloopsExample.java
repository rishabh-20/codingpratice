package com.company;

import java.util.Scanner;

public class ForloopsExample {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            boolean IsPrime=true;
            for(int i=2;i<=n;i++){
                if(n%2==0){
                    IsPrime=false;
                    break;

                }
            }
            if(n<2){
                IsPrime=false;
            }
        System.out.println("IsPrime "+IsPrime);
//            float result=0;
//            for(float i=1;i<=n;i++){
//                result +=1/i;
//            }
//        System.out.println(result);




//        Scanner sc =new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int result=1;
//        for(int i=0;i<b;i++){
//            result*=a;
//        }
//        System.out.println(result);


    }
//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int factroial =1;
//
//        for(int i=n;i>=1;i--){
//            factroial=factroial*i;
//
//        }
//        System.out.println(factroial);
//
//    }

}
