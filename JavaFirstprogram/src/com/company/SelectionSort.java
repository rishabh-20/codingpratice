package com.company;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={3,1,-2,7,4,0};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int midInd=i;
            for(int j=i;j<n;j++){
                if(a[j]<a[midInd]){
                    midInd=j;
                }
            }
        int temp=a[i];
        a[i]=a[midInd];
        a[midInd]=temp;
        }
        for(int e:a){
            System.out.print(e+" ");
        }
        
    }
}
