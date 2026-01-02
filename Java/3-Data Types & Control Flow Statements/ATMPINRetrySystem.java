package com.task;

import java.util.Scanner;

public class ATMPINRetrySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        int pin = 0;

        while (pin != correctPin) {
            System.out.print("Enter ATM PIN: ");
            pin = sc.nextInt();

            if (pin != correctPin) {
                System.out.println("Wrong PIN. Try again.");
            }
        }

        System.out.println("PIN accepted. Access granted.");
    }
}
