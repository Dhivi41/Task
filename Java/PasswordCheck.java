package com.task;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Weak password");
        } else {
            System.out.println("Strong password");
        }
        sc.close();
    }
}