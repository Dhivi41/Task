package array;
import java.util.Scanner;
public class ReplaceNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        
        int n = sc.nextInt();
       int[] arr = new int[n];
        System.out.println("Enter array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println("Updated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
