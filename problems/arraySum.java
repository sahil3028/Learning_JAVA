import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //int sum=Addition.Sum(arr,n);
        System.out.println("Sum of array elements: " + Addition.Sum(arr,n));
    }
}