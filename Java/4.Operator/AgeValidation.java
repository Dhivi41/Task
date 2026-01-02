package com.task;

import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18 && age <= 60) {
            System.out.println("Valid age");
        } else {
            System.out.println("Invalid age");
        }
    }
}
