package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static int balance=0;
    static ArrayList<String> transactions=new ArrayList<>();

    private static void Check_balance() {
        System.out.println(balance);
    }
    private static void withdraw(int amt) {
        if(amt>balance){
            System.out.println("not enough balance");
            return;
        }
        balance-=amt;
        System.out.println("the rem balance is: "+balance);
        transactions.add("Withdrawn : "+amt);
    }
    private static void deposit(int amt) {
        balance+=amt;
        System.out.println("new balance is: "+balance);
        transactions.add("Deposited : "+amt);

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int pin=1234,wrongPinCount=0;
        while(true){
            System.out.print("Enter PIN: ");
            int uPin=in.nextInt();
            if(uPin==pin){
                System.out.println("Pin was correct");
                break;
            } else if (wrongPinCount==3) {
                System.out.println("Account Locked");
                System.exit(0);
            } else{
                wrongPinCount++;
                System.out.println("Incorrect Pin, Try Again");
            }
        }
        int choice;

        while (true){
            System.out.println("""
                    1. Check Balance
                    2. Deposit
                    3. Withdraw
                    4. Transaction History
                    5. Exit""");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    main.Check_balance();
                    break;
                case 2:
                    System.out.print("Enter  the amount to deposit: ");
                    int amt=in.nextInt();

                    main.deposit(amt);
                    break;
                case 3:
                    System.out.print("Enter  the amount to withdraw: ");
                    amt=in.nextInt();
                    main.withdraw(amt);break;
                case 5:
                    System.exit(0);
                case 4:
                    for(String i:transactions) System.out.print("  "+i);
                    break;
                default:
                    System.out.println("Wrong Choice, Try again");
                    break;
            }
        }
    }


}
