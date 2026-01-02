package com.task;
import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Sum = " + (a + b));
            } 
            else if (choice == 2) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Difference = " + (a - b));
            } 
            else if (choice == 3) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Difference = " + (a * b));
            } 
            else if (choice == 4) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Difference = " + (a / b));
            } 
            else if (choice == 5) {
                System.out.println("Exiting program...");
            } 
            else {
                System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}
