package com.task;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";

        while (password.length() < 8) {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (password.length() < 8) {
                System.out.println("Password too short");
            }
        }

        System.out.println("Password accepted");
    }
}
