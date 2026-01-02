package com.task;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Program is running...");
            System.out.print("Do you want to continue? (y/n): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        System.out.println("Program stopped.");
    }
}
