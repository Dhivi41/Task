package com.task;

import java.util.Scanner;

public class IncrementToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num < 10) {
            num++;
            System.out.println("Value: " + num);
        }
    }
}
