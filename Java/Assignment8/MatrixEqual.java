package Assignment8;

import java.util.Scanner;

public class MatrixEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        boolean equal = true;

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (a[i][j] != b[i][j]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal)
            System.out.println("Matrices are equal");
        else
            System.out.println("Matrices are not equal");
    }
}
