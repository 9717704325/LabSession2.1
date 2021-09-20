package com.OOPSPROJECT1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] transactions = new int[size];
        for (int i=0; i<size; i++); {
            int i = 0;
            System.out.println("Enter"+ i+1 +"element");
            transactions[i] = sc.nextInt();
    }
    System.out.println("Enter the target");
    int target = sc.nextInt();
    Paymoney paymoney = new Paymoney();
    int no_of_days = paymoney.no_of_days(transactions, target);
    if(no_of_days == -1)

        System.out.println("Target are achived");

    else
        System.out.println("Traget is acheivable in" +no_of_days);

    }
}