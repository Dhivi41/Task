package com.task;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String correctUsername = "Dhivi";
        String correctPassword = "Dhivi@123";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
        sc.close();
    }
}
