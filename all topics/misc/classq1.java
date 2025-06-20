import java.util.Scanner;

public class classq1 {
    public static void main(String[] args) {
        System.out.println("Enter acc no\n email\nphone\nname\n balance");
        Scanner in=new Scanner(System.in);
        bankaccount bank=new bankaccount();
        bank.setBalance(in.nextDouble());
    }}
