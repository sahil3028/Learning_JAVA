
import java.util.Scanner;

public class ArrayOperations {

    static Scanner sc = new Scanner(System.in);

    public static int checkPos(int aSize) {
        System.out.print("Enter the position: ");
        int p = sc.nextInt();
        while (p > aSize) {
            System.out.printf("Entered position exceeds limit, try within %d\n", aSize);
            p = sc.nextInt();
        }
        return p - 1;
    }

    public static void insert(int[] a, int[] aSize) {
        int p = checkPos(aSize[0]);

        if (p + 1 == aSize[0]) {
            p++;
            System.out.print("Enter the value: ");
            a[p] = sc.nextInt();
            aSize[0]++;
            return;
        }

        for (int i = aSize[0] - 1; i >= p; i--) {
            a[i + 1] = a[i];
        }

        System.out.print("Enter the value: ");
        a[p] = sc.nextInt();
        aSize[0]++;
    }

    public static void delete(int[] a, int[] aSize) {
        int p = checkPos(aSize[0]);
        for (int i = p; i < aSize[0] - 1; i++) {
            a[i] = a[i + 1];
        }
        aSize[0]--;
    }

    public static void replace(int[] a, int aSize) {
        int p = checkPos(aSize);
        System.out.print("Enter the value to be replaced: ");
        a[p] = sc.nextInt();
    }

    public static void linearSearch(int[] a, int aSize) {
        System.out.print("Enter the value you want to search: ");
        int z = sc.nextInt();

        for (int i = 0; i < aSize; i++) {
            if (z == a[i]) {
                System.out.printf("Found at position %d\n", i + 1);
                return;
            }
        }
        System.out.println("Not found.");
    }

    public static void display(int[] a, int aSize) {
        for (int i = 0; i < aSize; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[50];
        int[] aSize = new int[1];

        System.out.print("Enter the size of your array: ");
        aSize[0] = sc.nextInt();

        while (aSize[0] > 50) {
            System.out.print("Exceeds max size limit, try within the range of 50: ");
            aSize[0] = sc.nextInt();
        }

        System.out.println("Enter the elements:");
        for (int i = 0; i < aSize[0]; i++) {
            a[i] = sc.nextInt();
        }

        int m;
        do {
            System.out.println("\nM E N U :\n1. Insert an element\n2. Delete an element\n3. Replace an element\n4. Search an element\n5. Display\n0. Exit");
            m = sc.nextInt();

            switch (m) {
                case 1:
                    insert(a, aSize);
                    break;
                case 2:
                    delete(a, aSize);
                    break;
                case 3:
                    replace(a, aSize[0]);
                    break;
                case 4:
                    linearSearch(a, aSize[0]);
                    break;
                case 5:
                    display(a, aSize[0]);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong input, try again.");
            }
        } while (m != 0);
    }
}
