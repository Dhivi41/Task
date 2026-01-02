package com.task;

import java.util.Scanner;
public class SalaryUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        salary += 2000; 
        salary -= 500;  
        salary *= 1.10;  
        salary /= 2;     

        System.out.println("Updated Salary: " + salary);
    }
}
