package com.company;

import java.util.Scanner;
/*
public class ood {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("********* odd Number *******");

    for (int i = 1; i < 100; i=i+2) // i initialize 1;condition <100; i=1+2=3 and print into 99 means odd
        System.out.println(i);  //print the i value until its goes to last odd value ,99

    /*
     for(int i=0;i<100;i++){
     if(i % 2  !=0){
       System.out.println(i);
     }
    }
//
}
}
*/
public class ood {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter the range of number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}