import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of array elements: " + Sum.Add(x,y));
    }
}